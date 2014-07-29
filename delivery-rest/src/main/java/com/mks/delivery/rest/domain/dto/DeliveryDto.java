package com.mks.delivery.rest.domain.dto;

import com.mks.delivery.domain.Delivery;

/**
 * Created by mscislowski on 2014-07-29.
 */
public class DeliveryDto {

    private Long id;
    private Boolean confirmedByPos;
    private Boolean confirmedByProvider;

    public static DeliveryDto toDto(Delivery delivery) {
        DeliveryDto deliveryDto = new DeliveryDto();
        deliveryDto.setId(delivery.getId());
        deliveryDto.setConfirmedByProvider(delivery.getConfirmedByProvider());
        delivery.setConfirmedByPos(delivery.getConfirmedByPos());
        return deliveryDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getConfirmedByPos() {
        return confirmedByPos;
    }

    public void setConfirmedByPos(Boolean confirmedByPos) {
        this.confirmedByPos = confirmedByPos;
    }

    public Boolean getConfirmedByProvider() {
        return confirmedByProvider;
    }

    public void setConfirmedByProvider(Boolean confirmedByProvider) {
        this.confirmedByProvider = confirmedByProvider;
    }

}
