package io.mycat.epx.service;

import io.mycat.epx.entity.DeliveryCorp;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by Liwh on 2015/12/16.
 */
public class DeliveryCorpServiceTest extends BaseTest {

    @Autowired
    private IDeliveryCorpService deliveryCorpService;

    @Test
    public void  testDeliveryCorpService(){
//        Example example = new Example(DeliveryCorp.class);
//        example.createCriteria().andGreaterThan("id", 0);
//        PageInfo<DeliveryCorp> list= deliveryCorpService.selectByExample(example, 1, 5);
//
//         System.out.println(JSON.toJSONString(list));
//
//        List<DeliveryCorp> customList = deliveryCorpService.getCustomizeQuery();
//        System.out.println(JSON.toJSONString(customList));

    }


    @Test
    @Transactional
    @Rollback(false)
    public void testTxDeliveryCorpService(){

        DeliveryCorp deliveryCorp = new DeliveryCorp();
        deliveryCorp.setModifyDate(new Date());
        deliveryCorp.setUrl("http://123.com");
        deliveryCorp.setOrders(1);
        deliveryCorp.setName("Test");
        deliveryCorp.setCreateDate(new Date());
        deliveryCorp.setCode("123");

        deliveryCorpService.save(deliveryCorp);

        deliveryCorp.setUrl("http://baidu.com");
        deliveryCorpService.updateAll(deliveryCorp);
//        deliveryCorp.setModifyDate(null);
        deliveryCorp.setUrl("http://google.com");
        deliveryCorpService.updateAll(deliveryCorp);


    }

}
