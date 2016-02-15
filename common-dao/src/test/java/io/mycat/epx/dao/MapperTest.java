package io.mycat.epx.dao;

import io.mycat.epx.dao.mapper.DeliveryCorpMapper;
import io.mycat.epx.entity.DeliveryCorp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by Liwh on 2015/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/spring-dao.xml")
public class MapperTest {

    @Autowired
    private DeliveryCorpMapper deliveryCorpMapper;

    @Test
    public void testDeliverCorp(){

        DeliveryCorp deliveryCorp = new DeliveryCorp();
        deliveryCorp.setCode("sf-express");
        deliveryCorp.setCreateDate(new Date());
        deliveryCorp.setModifyDate(new Date());
        deliveryCorp.setName("顺风快递");
        deliveryCorp.setOrders(1);
        deliveryCorp.setUrl("http://www.sf-express.com/");

         deliveryCorpMapper.insert(deliveryCorp);

        System.out.println(deliveryCorp.getId());

    }


}
