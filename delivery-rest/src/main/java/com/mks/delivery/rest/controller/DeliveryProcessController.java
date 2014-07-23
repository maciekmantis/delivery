package com.mks.delivery.rest.controller;

import com.mks.delivery.domain.Correction;
import com.mks.delivery.domain.Delivery;
import com.mks.delivery.domain.Product;
import com.mks.delivery.rest.dto.CorrectionDto;
import com.mks.delivery.rest.dto.DeliveryDto;
import com.mks.delivery.rest.dto.ProductDto;
import com.mks.delivery.service.DeliveryProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 06:54
 */

@RestController
public class DeliveryProcessController {

    @Autowired
    private DeliveryProcessService deliveryProcessService;

    public DeliveryDto createDelivery(int posId, List<ProductDto> productsDto) {
        List<Product> products = ProductDto.fromDto(productsDto);
        Delivery delivery = deliveryProcessService.createDelivery(posId, products);
        return DeliveryDto.toDto(delivery);
    }

    public DeliveryDto findDelivery(int deliveryId) {
        Delivery delivery = deliveryProcessService.findDelivery(deliveryId);
        return DeliveryDto.toDto(delivery);
    }

    public void confirmDeliveryByPos(int deliveryId) {
        deliveryProcessService.confirmDeliveryByPos(deliveryId);
    }

    public void correctDelivery(CorrectionDto correctionDto, int deliveryId) {
        Correction correction = CorrectionDto.fromDto(correctionDto);
        deliveryProcessService.correctDelivery(correction, deliveryId);
    }

}

//    @Autowired
//    DeliveryService deliveryService;
//    @Autowired
//    DeliveryDetailsService deliveryDetailsService;
//
//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public Delivery createDelivery(@PathVariable final Integer userId) {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("userId", userId.toString());
//        return deliveryService.createDelivery(
//                deliveryDetailsService.createDeliveryDetails(params));
//    }
//
//    @RequestMapping(value = "/{deliveryId}", method = RequestMethod.PUT)
//    @ResponseStatus(HttpStatus.OK)
//    public Delivery updateDelivery(@PathVariable final Integer deliveryId, Map<String, String> params) {
//        Delivery delivery = deliveryService.findDeliveryById(deliveryId);
//        return deliveryService.updateDelivery(delivery,
//                deliveryDetailsService.createDeliveryDetails(params));
//    }
