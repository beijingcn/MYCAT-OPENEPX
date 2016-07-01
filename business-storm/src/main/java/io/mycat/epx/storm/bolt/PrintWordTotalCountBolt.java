package io.mycat.epx.storm.bolt;

import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Liwh on 2016/5/13.
 */
public class PrintWordTotalCountBolt extends BaseBasicBolt {
    private static final Logger LOG = LoggerFactory.getLogger(PrintWordTotalCountBolt.class);
    @Override
    public void execute(Tuple input, BasicOutputCollector collector) {
        String wordName = input.getStringByField("wordName");
        String countStr = input.getStringByField("count");

        // print lookup result with low probability
        if(ThreadLocalRandom.current().nextInt(1000) > 800) {
            int count = 0;
            if (countStr != null) {
                count = Integer.parseInt(countStr);
            }
            LOG.info("Lookup result - word : " + wordName + " / count : " + count);
        }

    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {

    }
}
