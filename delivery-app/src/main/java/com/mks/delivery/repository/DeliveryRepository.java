package com.mks.delivery.repository;

import com.mks.delivery.domain.Delivery;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mscislowski on 2014-07-29.
 */
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}
