package io.mycat.epx.storm.topology;

import io.mycat.epx.storm.bolt.PrintWordTotalCountBolt;
import io.mycat.epx.storm.bolt.SplitSentence;
import io.mycat.epx.storm.bolt.WordCount;
import io.mycat.epx.storm.mapper.WordCountRedisLookupMapper;
import io.mycat.epx.storm.mapper.WordCountRedisStoreMapper;
import io.mycat.epx.storm.spout.RandomSentenceSpout;
import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.generated.AlreadyAliveException;
import org.apache.storm.generated.AuthorizationException;
import org.apache.storm.generated.InvalidTopologyException;
import org.apache.storm.redis.bolt.RedisLookupBolt;
import org.apache.storm.redis.bolt.RedisStoreBolt;
import org.apache.storm.redis.common.config.JedisPoolConfig;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.tuple.Fields;

/**
 * Created by Liwh on 2016/5/13.
 * 测试 Redis 存储 查询
 * bin/storm jar examples/business-storm-1.0-SNAPSHOT-all.jar RedisDemoTopoloy 192.168.0.224 6379 redis_demo
 */
public class RedisDemoTopoloy  {

    public static void main(String [] args) throws InvalidTopologyException, AuthorizationException, AlreadyAliveException {

        Config config = new Config();

        String host  ;
        int port  ;
        String name  ;

        if (args.length == 3) {
            host = args[0];
            port = Integer.parseInt(args[1]);
            name = args[2];
        }else{
            System.out.println("Usage: RedisDemoTopoloy <redis host> <redis port> (topology name)");
            return;
        }

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig.Builder().setHost(host).setPort(port).build();

        RedisStoreBolt storeBolt = new RedisStoreBolt(jedisPoolConfig,new WordCountRedisStoreMapper());
        RedisLookupBolt lookupBolt = new RedisLookupBolt(jedisPoolConfig,new WordCountRedisLookupMapper());

        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("sentence", new RandomSentenceSpout(), 5).setCPULoad(5);
        builder.setBolt("split",new SplitSentence(),5).setNumTasks(3).shuffleGrouping("sentence").setCPULoad(5);
        builder.setBolt("count",new WordCount(),5).setNumTasks(5).fieldsGrouping("split", new Fields("word")).setCPULoad(5);

        //存储到Redis
        builder.setBolt("storeBolt", storeBolt, 5).shuffleGrouping("count");

        //从Redis查询
        builder.setBolt("lookupBolt",lookupBolt,5).fieldsGrouping("split", new Fields("word")).setCPULoad(5);

        //打印
        builder.setBolt("printBolt",new PrintWordTotalCountBolt(),5).shuffleGrouping("lookupBolt");


        //提交拓扑
        StormSubmitter.submitTopologyWithProgressBar(name,config,builder.createTopology());




    }



}
