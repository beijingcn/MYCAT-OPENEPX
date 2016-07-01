package cn.com.pencho.storm.mapper;

import org.apache.storm.redis.common.mapper.RedisDataTypeDescription;
import org.apache.storm.redis.common.mapper.RedisStoreMapper;
import org.apache.storm.tuple.ITuple;

/**
 * Created by Liwh on 2016/5/13.
 */
public class WordCountRedisStoreMapper implements RedisStoreMapper {

    private RedisDataTypeDescription description;
    private final String hashKey = "wordCount";

    public WordCountRedisStoreMapper() {
        description = new RedisDataTypeDescription(RedisDataTypeDescription.RedisDataType.HASH,hashKey);
    }


    @Override
    public RedisDataTypeDescription getDataTypeDescription() {
        return description;
    }

    @Override
    public String getKeyFromTuple(ITuple tuple) {
        return tuple.getStringByField("word");
    }

    @Override
    public String getValueFromTuple(ITuple tuple) {
        return tuple.getStringByField("count");
    }
}
