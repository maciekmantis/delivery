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

    public Delivery createDelivery(Integer posId, List<Product> products) {
        Delivery delivery = deliveryService.prepareDelivery(posId, products)
        deliveryService.confirmDeliveryByProvider(delivery.id)
        documentService.generateWZ(delivery.id)
        return delivery
    }

    public Delivery findDelivery(Integer deliveryId) {
        return deliveryService.findDeliveryById(deliveryId)

    }

    public void confirmDeliveryByPos(Integer deliveryId) {
        deliveryService.confirmDeliveryByPos(deliveryId)
        documentService.generateInvoice(deliveryId)
    }

    public void correctDelivery(Correction correction, Integer deliveryId) {
        deliveryService.correctDelivery(correction, deliveryId)
        documentService.generateWZCorrection(deliveryId)
        documentService.generateWZ(deliveryId)

    }

}


