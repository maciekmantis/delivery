package com.mks.delivery.rest.dto;

import com.mks.delivery.domain.Delivery;

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 06:58
 */
public class DeliveryDto {

    private int id;
    private boolean confirmedByPos;

    public static DeliveryDto toDto(Delivery delivery) {
        DeliveryDto deliveryDto = new DeliveryDto();
        deliveryDto.setId(delivery.getId());
        deliveryDto.setConfirmedByPos(delivery.getConfirmedByPos());
        return deliveryDto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setConfirmedByPos(boolean confirmedByPos) {
        this.confirmedByPos = confirmedByPos;
    }

    public boolean isConfirmedByPos() {
        return confirmedByPos;
    }
}
