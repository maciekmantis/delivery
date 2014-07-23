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

    Delivery prepareDelivery(int posId, List<Product> products) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    Delivery confirmDeliveryByProvider(int deliveryId) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    Delivery findDeliveryById(int deliveryId) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    void confirmDeliveryByPos(int deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }

    void correctDelivery(Correction correction, int deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }
}
