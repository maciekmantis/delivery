package com.mks.delivery.rest.domain;

import java.math.BigDecimal;

/**
 * Created by mscislowski on 2014-07-29.
 */
public class ProductSet {

    private String code;
    private BigDecimal quantity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
