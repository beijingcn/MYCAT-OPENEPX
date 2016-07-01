package cn.com.pencho.storm.bolt;


import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

import java.util.List;
import java.util.Map;

/**
 * Created by Liwh on 2016/5/10.
 */
public class DemoBoltA extends BaseRichBolt {
    OutputCollector _collector;

    @Override
    public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
        _collector = collector;
    }

    @Override
    public void execute(Tuple input) {


            int avg  =  0 ;

            if (input.size()>0){
                int sum =0;
                List<Object> values =input.getValues();
                for(Object o:values){
                    sum+=(int)o;
                }
                avg = sum/values.size();
            }

            _collector.emit(new Values(avg));
            _collector.ack(input);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
            declarer.declare(new Fields("avg"));
    }




}
