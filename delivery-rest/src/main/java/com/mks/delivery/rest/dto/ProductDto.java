package com.mks.delivery.rest.dto;

import com.mks.delivery.domain.Product;

import java.util.List;

/**
 * User: maciek
 * Date: 23.07.2014
 * Time: 06:59
 */
public class ProductDto {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static List<Product> fromDto(List<ProductDto> productsDto) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

}
