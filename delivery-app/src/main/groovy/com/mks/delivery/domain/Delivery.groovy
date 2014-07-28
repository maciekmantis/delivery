package com.mks.delivery.domain

import javax.persistence.Entity
import javax.persistence.Id

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 07:02
 */

@Entity
class Delivery implements Serializable {

    @Id
    Integer id
    Boolean confirmedByPos
    Boolean confirmedByProvider
}
