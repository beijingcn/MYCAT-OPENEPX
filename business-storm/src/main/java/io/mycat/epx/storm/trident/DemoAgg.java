package io.mycat.epx.storm.trident;

import org.apache.storm.trident.operation.BaseAggregator;
import org.apache.storm.trident.operation.TridentCollector;
import org.apache.storm.trident.tuple.TridentTuple;
import org.apache.storm.tuple.Values;

/**
 * Created by Liwh on 2016/5/10.
 * Aggregators能够发射任意数量，任意字段的元组。并且可以在执行期间的任何时候发射元组，它的执行流程如下：
 处理batch之前调用init方法，init函数的返回值是一个表示聚合状态的对象，该对象会传递到aggregate和complete函数；
 每个在batch分区中的元组都会调用aggregate方法，该方法能够更新聚合状态并且发射元组；
 当batch分区中的所有元组都被aggregate函数处理完时调用complete函数。
 */
public class DemoAgg extends BaseAggregator<DemoAgg.CountState> {
    static  class CountState{
        long count = 0;
    }

    @Override
    public CountState init(Object batchId, TridentCollector collector) {
        return new CountState();
    }

    @Override
    public void aggregate(CountState val, TridentTuple tuple, TridentCollector collector) {
            val.count+=1;
    }

    @Override
    public void complete(CountState val, TridentCollector collector) {
            collector.emit(new Values(val.count));
    }

}
