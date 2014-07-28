package com.mks.delivery.service

import com.mks.delivery.domain.Correction
import com.mks.delivery.domain.Delivery
import com.mks.delivery.domain.Product
import com.mks.delivery.repository.DeliveryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 07:09
 */

@Service
class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository

    Delivery createDelivery(Integer posId, List<Product> products) {
        Delivery delivery = new Delivery()
        delivery.id = 1
        deliveryRepository.save(delivery)
        return delivery
    }

    void confirmDeliveryByProvider(Integer deliveryId) {
        Delivery delivery = deliveryRepository.findOne(1)
        delivery.confirmedByProvider = true
    }

    void confirmDeliveryByPos(Integer deliveryId) {
        Delivery delivery = deliveryRepository.findOne(1)
        delivery.confirmedByPos = true
    }

    Delivery findDeliveryById(Integer deliveryId) {
        return deliveryRepository.findOne(1)
    }

    void correctDelivery(Correction correction, Integer deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }
}
