package com.mks.delivery.repository

import com.mks.delivery.domain.Delivery
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * User: maciek
 * Date: 28.07.2014
 * Time: 07:11
 */

interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}
