package io.mycat.epx.storm;

import org.apache.storm.Config;
import org.apache.storm.thrift.TException;
import org.apache.storm.utils.DRPCClient;
import org.junit.Test;

/**
 * Created by Liwh on 2016/5/11.
 */
public class DrpcTopologyTest {


    @Test
    public void testA() throws TException {
        Config conf = new Config();

        conf.setDebug(true);
        conf.put("storm.thrift.transport", "org.apache.storm.security.auth.SimpleTransportPlugin");
        conf.put(Config.STORM_NIMBUS_RETRY_TIMES, 3);
        conf.put(Config.STORM_NIMBUS_RETRY_INTERVAL, 10);
        conf.put(Config.STORM_NIMBUS_RETRY_INTERVAL_CEILING, 20);
        conf.put(Config.DRPC_PORT,3372);
        conf.put(Config.DRPC_MAX_BUFFER_SIZE, 1048576);
        DRPCClient client = new DRPCClient(conf,"192.168.0.221",3772);
        System.out.println(client.execute("word", "cat dog the man"));
    }
}
