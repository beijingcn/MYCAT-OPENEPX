package cn.com.pencho.storm.topology;

import cn.com.pencho.storm.bolt.DemoBoltA;
import cn.com.pencho.storm.bolt.DemoBoltB;
import cn.com.pencho.storm.spout.DemoSpout;
import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.topology.TopologyBuilder;

/**
 * Created by Liwh on 2016/5/10.
 */
public class DemoTopology {

    public static void main(String[] args) throws Exception {

        TopologyBuilder builder = new TopologyBuilder();

        Config config = new Config();
        config.setNumWorkers(2);
        builder.setSpout("random_int", new DemoSpout(), 3);
        builder.setBolt("avg_bolt",new DemoBoltA(),3).shuffleGrouping("random_int");
        builder.setBolt("print",new DemoBoltB(),3).shuffleGrouping("avg_bolt");


        StormSubmitter.submitTopologyWithProgressBar("demo",config,builder.createTopology());

    }
}
