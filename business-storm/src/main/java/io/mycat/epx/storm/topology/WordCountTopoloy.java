package io.mycat.epx.storm.topology;

import io.mycat.epx.storm.bolt.SplitSentence;
import io.mycat.epx.storm.bolt.WordCount;
import io.mycat.epx.storm.spout.RandomSentenceSpout;
import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.generated.AlreadyAliveException;
import org.apache.storm.generated.AuthorizationException;
import org.apache.storm.generated.InvalidTopologyException;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.tuple.Fields;

/**
 * Created by Liwh on 2016/5/11.
 * DEMO
 */
public class WordCountTopoloy {

    public static void main(String[] args) throws InvalidTopologyException, AuthorizationException, AlreadyAliveException {

        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("sentence", new RandomSentenceSpout(), 5).setCPULoad(5);
        builder.setBolt("split",new SplitSentence(),5).setNumTasks(3).shuffleGrouping("sentence").setCPULoad(5);
        builder.setBolt("count",new WordCount(),5).setNumTasks(5).fieldsGrouping("split", new Fields("word")).setCPULoad(5);

        Config conf = new Config();
        conf.setNumWorkers(2);

        String name = "wc-test";
        StormSubmitter.submitTopologyWithProgressBar(name,conf,builder.createTopology());

    }
}
