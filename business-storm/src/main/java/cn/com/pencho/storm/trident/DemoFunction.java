package cn.com.pencho.storm.trident;

import org.apache.storm.trident.operation.BaseFunction;
import org.apache.storm.trident.operation.TridentCollector;
import org.apache.storm.trident.tuple.TridentTuple;
import org.apache.storm.tuple.Values;

/**
 * Created by Liwh on 2016/5/10.
 * 函数接收一些字段作为输入，发射零个或多个元组作为输出。输出元组的字段追加到输入元组的字段的后面
 */
public class DemoFunction extends BaseFunction {
    @Override
    public void execute(TridentTuple tuple, TridentCollector collector) {
        for(int i=0;i<tuple.getInteger(0);i++){
            collector.emit(new Values(i));
        }
    }
}
