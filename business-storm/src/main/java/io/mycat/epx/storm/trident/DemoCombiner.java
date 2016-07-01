package io.mycat.epx.storm.trident;

import org.apache.storm.trident.operation.CombinerAggregator;
import org.apache.storm.trident.tuple.TridentTuple;

/**
 * Created by Liwh on 2016/5/10.
 * CombinerAggregator返回只有一个字段的一个元组。CombinerAggregator在每个输入元组上运行init函数，然后通过combine函数聚合结果值直到只剩下一个元组。如果分区中没有任何元组，CombinerAggregator将返回zero函数中定义的元组。
 */
public class DemoCombiner implements CombinerAggregator {
    @Override
    public Object init(TridentTuple tuple) {
        return 1;
    }

    @Override
    public Object combine(Object val1, Object val2) {
        return (Long)val1+(Long)val2;
    }

    @Override
    public Object zero() {
        return 0;
    }
}
