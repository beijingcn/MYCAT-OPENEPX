package cn.com.pencho.storm.trident;

import org.apache.storm.trident.operation.ReducerAggregator;
import org.apache.storm.trident.tuple.TridentTuple;

/**
 * Created by Liwh on 2016/5/10.
 * ReducerAggregator通过init函数得到一个初始的值，然后对每个输入元组调用reduce方法计算值，产生一个元组作为输出。
 */
public class DemoReducer implements ReducerAggregator {
    @Override
    public Object init() {
        return 0;
    }

    @Override
    public Object reduce(Object curr, TridentTuple tuple) {
        return (long)curr+tuple.getLong(0);
    }
}
