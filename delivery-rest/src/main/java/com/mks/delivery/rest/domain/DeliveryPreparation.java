package com.mks.delivery.rest.domain;

import java.util.List;

/**
 * Created by mscislowski on 2014-07-29.
 */
public class DeliveryPreparation {

    private Long posId;
    private List<ProductSet> productSets;

    public Long getPosId() {
        return posId;
    }

    public void setPosId(Long posId) {
        this.posId = posId;
    }

    public List<ProductSet> getProductSets() {
        return productSets;
    }

    public void setProductSets(List<ProductSet> productSets) {
        this.productSets = productSets;
    }

}
