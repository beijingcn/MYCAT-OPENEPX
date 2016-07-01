package io.mycat.epx.storm.topology;

import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.drpc.DRPCSpout;
import org.apache.storm.drpc.ReturnResults;
import org.apache.storm.generated.AlreadyAliveException;
import org.apache.storm.generated.AuthorizationException;
import org.apache.storm.generated.InvalidTopologyException;
import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

/**
 * Created by Liwh on 2016/5/11.
 * bin/storm jar examples/business-storm-1.0-SNAPSHOT-all.jar DRPCTopology
 * 客户端调用：
 * DRPCClient client = new DRPCClient("drpc.server.location", 3772);
    System.out.println(client.execute("wordCount", "cat dog the man");
 *
 */
public class DRPCTopology  {

    public static class ExclamationBolt extends BaseBasicBolt {

        @Override
        public void declareOutputFields(OutputFieldsDeclarer declarer) {
            declarer.declare(new Fields("result", "return-info"));
        }

        @Override
        public void execute(Tuple tuple, BasicOutputCollector collector) {
            String arg = tuple.getString(0);
            Object retInfo = tuple.getValue(1);
            collector.emit(new Values(arg + "!!!", retInfo));
        }

    }




    public static void main(String [] agrs) throws InvalidTopologyException, AuthorizationException, AlreadyAliveException {


        TopologyBuilder builder = new TopologyBuilder();

        DRPCSpout spout = new DRPCSpout("word");

        builder.setSpout("drpc", spout, 2).setCPULoad(10);
        builder.setBolt("exclaim", new ExclamationBolt(), 3).shuffleGrouping("drpc").setCPULoad(10);
        builder.setBolt("return", new ReturnResults(), 3).shuffleGrouping("exclaim").setCPULoad(10);

        Config conf = new Config();
        conf.setNumWorkers(2);

        StormSubmitter.submitTopologyWithProgressBar("drpc-demo",conf,builder.createTopology());


    }


}
