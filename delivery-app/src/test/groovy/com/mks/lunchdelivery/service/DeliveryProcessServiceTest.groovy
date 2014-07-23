package com.mks.lunchdelivery.service

import com.mks.delivery.config.AppConfig
import com.mks.delivery.domain.Delivery
import com.mks.delivery.domain.Product
import com.mks.delivery.service.DeliveryProcessService
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by mscislowski on 10.07.14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = [AppConfig.class])
class DeliveryProcessServiceTest {

    @Autowired
    DeliveryProcessService deliveryProcessService

    @Test
    void deliveryWithConfirmation() {
        int posId= 1
        Delivery delivery = deliveryProcessService.createDelivery(posId, new ArrayList<Product>())
        deliveryProcessService.confirmDeliveryByPos(delivery.id)
        Assert.assertNotNull('Delivery cannot be null', delivery)
        Assert.assertTrue('Delivery is not confirmed by POS', delivery.confirmedByPos)
    }



}
