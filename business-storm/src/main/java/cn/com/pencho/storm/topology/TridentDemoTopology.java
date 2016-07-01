package cn.com.pencho.storm.topology;

import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.generated.AlreadyAliveException;
import org.apache.storm.generated.AuthorizationException;
import org.apache.storm.generated.InvalidTopologyException;
import org.apache.storm.trident.TridentState;
import org.apache.storm.trident.TridentTopology;
import org.apache.storm.trident.operation.builtin.Count;
import org.apache.storm.trident.operation.builtin.FilterNull;
import org.apache.storm.trident.operation.builtin.MapGet;
import org.apache.storm.trident.operation.builtin.Sum;
import org.apache.storm.trident.testing.FixedBatchSpout;
import org.apache.storm.trident.testing.MemoryMapState;
import org.apache.storm.trident.testing.Split;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

/**
 * Created by Liwh on 2016/5/11.
 *  从一个句子的输入数据流中计算出单词流的数量
    实现对一个单词列表中每个单词总数的查询
    bin/storm jar examples/business-storm-1.0-SNAPSHOT-all.jar cn.com.pencho.storm.topology.TridentDemoTopology
    客户端调用：
     DRPCClient client = new DRPCClient("drpc.server.location", 3772);
     System.out.println(client.execute("words", "cat dog the man");
       // prints the JSON-encoded result, e.g.: "[[5078]]"
 */
public class TridentDemoTopology {

    public static FixedBatchSpout getSpout(){
        FixedBatchSpout spout = new FixedBatchSpout(new Fields("sentence"), 3,
                new Values("the cow jumped over the moon"),
                new Values("the man went to the store and bought some candy"),
                new Values("four score and seven years ago"),
                new Values("how many apples can you eat"));
        spout.setCycle(true);
        return spout;
    }





    public static void main (String [] args) throws InvalidTopologyException, AuthorizationException, AlreadyAliveException {


        TridentTopology topology = new TridentTopology();
        //从一个句子的输入数据流中计算出单词流的数量
        TridentState wordCounts =
                topology.newStream("spout1", getSpout()).setCPULoad(10)
                        .each(new Fields("sentence"), new Split(), new Fields("word"))
                        .groupBy(new Fields("word"))
                        .persistentAggregate(new MemoryMapState.Factory(), new Count(), new Fields("count"))
                        //Memcached 示例：
                        //persistentAggregate(MemcachedState.transactional(serverLocations), new Count(), new Fields("count"))
                        .parallelismHint(6).setCPULoad(10);
        // 实现对一个单词列表中每个单词总数的查询
        topology.newDRPCStream("words")
                .each(new Fields("args"), new Split(), new Fields("word"))
                .groupBy(new Fields("word"))
                .stateQuery(wordCounts, new Fields("word"), new MapGet(), new Fields("count"))
                .each(new Fields("count"), new FilterNull());
                //.aggregate(new Fields("count"), new Sum(), new Fields("sum")).setCPULoad(10);



        Config conf = new Config();
        conf.setMaxSpoutPending(20);
        conf.setNumWorkers(3);


        StormSubmitter.submitTopologyWithProgressBar("Trident_drpc",conf,topology.build());



    }



}
