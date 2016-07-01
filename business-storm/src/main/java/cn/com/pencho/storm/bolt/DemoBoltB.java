package cn.com.pencho.storm.bolt;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

import java.util.Map;

/**
 * Created by Liwh on 2016/5/10.
 */
public class DemoBoltB extends BaseRichBolt {
    OutputCollector _collector;


    @Override
    public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
        _collector= collector;
    }

    @Override
    public void execute(Tuple input) {

        System.out.println(input);
        _collector.ack(input);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {

    }




}
