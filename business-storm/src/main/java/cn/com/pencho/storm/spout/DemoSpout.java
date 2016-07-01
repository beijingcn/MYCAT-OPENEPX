package cn.com.pencho.storm.spout;



import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.Utils;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Liwh on 2016/5/9.
 */
public class DemoSpout  extends BaseRichSpout {

    SpoutOutputCollector _collector;


    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("a","b","c"));
    }

    @Override
    public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
        _collector = collector;
    }

    @Override
    public void nextTuple() {

        Utils.sleep(100);

        Integer a = ThreadLocalRandom.current().nextInt(100);
        Integer b = ThreadLocalRandom.current().nextInt(100);
        Integer c = ThreadLocalRandom.current().nextInt(100);

        _collector.emit(new Values(a,b,c));

    }


}
