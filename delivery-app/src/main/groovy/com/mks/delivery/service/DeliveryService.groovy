package com.mks.delivery.service

import com.mks.delivery.domain.Correction
import com.mks.delivery.domain.Delivery
import com.mks.delivery.domain.Product
import org.springframework.stereotype.Service

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 07:09
 */

@Service
class DeliveryService {

    Delivery prepareDelivery(Integer posId, List<Product> products) {
        Delivery delivery = new Delivery()
        delivery.id = 1
        delivery.confirmedByPos = true
        return delivery
    }

    void confirmDeliveryByProvider(Integer deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }

    Delivery findDeliveryById(Integer deliveryId) {
        Delivery delivery = new Delivery()
        delivery.id = 1
        delivery.confirmedByPos = true
        return delivery
    }

    void confirmDeliveryByPos(Integer deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }

    void correctDelivery(Correction correction, Integer deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }
}
