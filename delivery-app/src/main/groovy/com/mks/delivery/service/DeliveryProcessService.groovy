package com.mks.delivery.service

import com.mks.delivery.domain.Correction
import com.mks.delivery.domain.Delivery
import com.mks.delivery.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 07:06
 */

@Service
class DeliveryProcessService {

    @Autowired
    private DeliveryService deliveryService
    @Autowired
    private DocumentService documentService

    public Delivery createDelivery(int posId, List<Product> products) {
        Delivery delivery = deliveryService.prepareDelivery(posId, products)
        delivery = deliveryService.confirmDeliveryByProvider(delivery.deliveryId)
        documentService.generateWZ(delivery.deliveryId)
        return delivery
    }


    public Delivery findDelivery(int deliveryId) {
        return deliveryService.findDeliveryById(deliveryId)

    }

    public void confirmDeliveryByPos(int deliveryId) {
        delivery = deliveryService.confirmDeliveryByPos(deliveryId)
        documentService.generateInvoice(deliveryId)
    }

    public void correctDelivery(Correction correction, int deliveryId) {
        deliveryService.correctDelivery(correction, deliveryId)
        documentService.generateWZCorrection(deliveryId)
        documentService.generateWZ(deliveryId)

    }

}


