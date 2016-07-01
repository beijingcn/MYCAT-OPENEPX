package cn.com.pencho.storm.trident;

import org.apache.storm.trident.operation.BaseFilter;
import org.apache.storm.trident.tuple.TridentTuple;

/**
 * Created by Liwh on 2016/5/10.
 * 过滤器把一个元组作为输入，并决定是否需要保留该元组。
 */
public class DemoFilter extends BaseFilter {
    @Override
    public boolean isKeep(TridentTuple tuple) {
        return tuple.getInteger(0) == 1 && tuple.getInteger(1) == 2;
    }
}
