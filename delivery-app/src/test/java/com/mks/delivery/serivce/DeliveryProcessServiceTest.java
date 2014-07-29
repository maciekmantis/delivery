package com.mks.delivery.serivce;

import com.mks.delivery.config.AppConfig;
import com.mks.delivery.service.DeliveryProcessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by mscislowski on 2014-07-29.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class DeliveryProcessServiceTest {

    @Autowired
    private DeliveryProcessService deliveryProcessService;

    @Test
    public void deliveryWithConfirmation() {
//        int posId= 1
//        Delivery delivery = deliveryProcessService.createDelivery(posId, new ArrayList<Product>())
//        deliveryProcessService.confirmDeliveryByPos(delivery.id)
//        Assert.assertNotNull('Delivery cannot be null', delivery)
//        Assert.assertNotNull('Confirmed by POS cannot be null', delivery.confirmedByPos)
//        Assert.assertTrue('Delivery is not confirmed by POS', delivery.confirmedByPos)
    }

}
