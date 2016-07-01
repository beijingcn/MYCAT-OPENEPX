package cn.com.pencho.storm.spout;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.Utils;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Liwh on 2016/5/11.
 * DEMO
 */
public class RandomSentenceSpout extends BaseRichSpout {

    SpoutOutputCollector _collector;
    Random _rand;
    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("word"));
    }

    @Override
    public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
        _collector = collector;
        _rand = ThreadLocalRandom.current();
    }

    @Override
    public void nextTuple() {
        Utils.sleep(1000);
        String[] sentences = new String[]{ "A B C", "D E F",
                "H I J"};
        String sentence = sentences[_rand.nextInt(sentences.length)];
        _collector.emit(new Values(sentence));
    }


}
