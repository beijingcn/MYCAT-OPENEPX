package cn.com.pencho.storm.bolt;

import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Liwh on 2016/5/11.
 * DEMO
 */
public class WordCount extends BaseBasicBolt {

    private static final Logger logger = LoggerFactory.getLogger(WordCount.class);

    Integer id;
    String name;

    Map<String, Integer> counts = new HashMap<String, Integer>();

    @Override
    public void prepare(Map stormConf, TopologyContext context) {
        super.prepare(stormConf, context);
        name = context.getThisComponentId();
        id = context.getThisTaskId();

    }

    @Override
    public void execute(Tuple input, BasicOutputCollector collector) {
        String word = input.getString(0);
        Integer count = counts.get(word);
        if (count == null)
            count = 0;
        count++;
        counts.put(word, count);
        logger.info("-- execute 【" + name + "-" + id + "】 -- Word [" + word + ": " + count+"]");
        collector.emit(new Values(word, String.valueOf(count)));
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("word", "count"));
    }

    @Override
    public void cleanup() {
//        Clean up is not called on the cluster. Just localMode
        super.cleanup();
        logger.info("-- 单词数 【" + name + "-" + id + "】 --");
        for(Map.Entry<String,Integer> entry : counts.entrySet()) {
            logger.info(entry.getKey()+": "+entry.getValue());
        }

    }




}
