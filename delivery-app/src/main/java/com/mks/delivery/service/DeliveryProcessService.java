package com.mks.delivery.service;

import com.mks.delivery.domain.Correction;
import com.mks.delivery.domain.Delivery;
import com.mks.delivery.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mscislowski on 2014-07-29.
 */
@Service
public class DeliveryProcessService {

    @Autowired
    private DeliveryService deliveryService;
    @Autowired
    private DocumentService documentService;

    public Delivery createDelivery(Long posId, List<Product> products) {
        Delivery delivery = deliveryService.createDelivery(posId, products);
        return delivery;
    }

    public Delivery findDelivery(Integer deliveryId) {
        return deliveryService.findDeliveryById(deliveryId);

    }

    public void confirmDeliveryByProvider(Integer deliveryId) {
        deliveryService.confirmDeliveryByProvider(deliveryId);
        documentService.generateWZ(deliveryId);
    }

    public void confirmDeliveryByPos(Integer deliveryId) {
        deliveryService.confirmDeliveryByPos(deliveryId);
        documentService.generateInvoice(deliveryId);
    }

    public void correctDelivery(Correction correction, Integer deliveryId) {
        deliveryService.correctDelivery(correction, deliveryId);
        documentService.generateWZCorrection(deliveryId);
        documentService.generateWZ(deliveryId);

    }

}
