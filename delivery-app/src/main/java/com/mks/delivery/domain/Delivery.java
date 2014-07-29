package com.mks.delivery.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mscislowski on 2014-07-29.
 */

@Entity
public class Delivery {

    private Long id;
    private Boolean confirmedByPos;
    private Boolean confirmedByProvider;

    @Id
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
