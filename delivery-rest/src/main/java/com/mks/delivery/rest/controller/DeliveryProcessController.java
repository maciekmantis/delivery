package com.mks.delivery.rest.controller;

import com.mks.delivery.domain.Correction;
import com.mks.delivery.domain.Delivery;
import com.mks.delivery.domain.Product;
import com.mks.delivery.rest.dto.CorrectionDto;
import com.mks.delivery.rest.dto.DeliveryDto;
import com.mks.delivery.rest.dto.ProductDto;
import com.mks.delivery.service.DeliveryProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/deliveries", method = RequestMethod.POST)
    public DeliveryDto createDelivery(
            @RequestParam(required = false) String posId,
            @RequestBody(required = false) List<ProductDto> productsDto) {
        List<Product> products = ProductDto.fromDto(productsDto);
        Delivery delivery = deliveryProcessService.createDelivery(Integer.parseInt("10"), products);
        return DeliveryDto.toDto(delivery);
    }

    @RequestMapping(value = "/delivery/{deliveryId}", method = RequestMethod.GET)
    public DeliveryDto findDelivery(@PathVariable Integer deliveryId) {
        Delivery delivery = deliveryProcessService.findDelivery(deliveryId);
        return DeliveryDto.toDto(delivery);
    }

    @RequestMapping(value = "/delivery/{deliveryId}/provider-confirmation", method = RequestMethod.POST)
    public void confirmDeliveryByProvider(@PathVariable Integer deliveryId) {
        deliveryProcessService.confirmDeliveryByProvider(deliveryId);
    }

    @RequestMapping(value = "/delivery/{deliveryId}/pos-confirmation", method = RequestMethod.POST)
    public void confirmDeliveryByPos(@PathVariable Integer deliveryId) {
        deliveryProcessService.confirmDeliveryByPos(deliveryId);
    }

    @RequestMapping(value = "/delivery/{deliveryId}/correction", method = RequestMethod.POST)
    public void correctDelivery(@RequestBody CorrectionDto correctionDto, @PathVariable Integer deliveryId) {
        Correction correction = CorrectionDto.fromDto(correctionDto);
        deliveryProcessService.correctDelivery(correction, deliveryId);
    }

}

/**
 * deliveries POST - new delivery for user (from param)
 * deliveries GET - get deliveries by user (from param)
 *
 * delivery/{deliveryId} GET - get particulary delivery for user (form param)
 * delivery/{id}/provider-confirmation
 * delivery/{id}/pos-confirmation
 *
 *
 */


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
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    @ResponseStatus(HttpStatus.OK)
//    public Delivery updateDelivery(@PathVariable final Integer id, Map<String, String> params) {
//        Delivery delivery = deliveryService.findDeliveryById(id);
//        return deliveryService.updateDelivery(delivery,
//                deliveryDetailsService.createDeliveryDetails(params));
//    }
