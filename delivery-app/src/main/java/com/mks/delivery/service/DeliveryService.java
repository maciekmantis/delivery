package com.mks.delivery.service;

import com.mks.delivery.domain.Correction;
import com.mks.delivery.domain.Delivery;
import com.mks.delivery.domain.Product;
import com.mks.delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mscislowski on 2014-07-29.
 */
@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public Delivery createDelivery(Long posId, List<Product> products) {
        Delivery delivery = new Delivery();
        delivery.setId(1L);
        delivery.setConfirmedByProvider(true);
        delivery.setConfirmedByPos(true);
        deliveryRepository.save(delivery);
        return delivery;
    }

    public void confirmDeliveryByProvider(Integer deliveryId) {
//        Delivery delivery = deliveryRepository.findOne(1);
//        delivery.confirmedByProvider = true;
    }

    public void confirmDeliveryByPos(Integer deliveryId) {
//        Delivery delivery = deliveryRepository.findOne(1);
//        delivery.confirmedByPos = true;
    }

    public Delivery findDeliveryById(Integer deliveryId) {
        return deliveryRepository.findOne(1L);
    }

    public void correctDelivery(Correction correction, Integer deliveryId) {
        //To change body of created methods use File | Settings | File Templates.
    }

}
