package com.dtidigital.dojo.serasa.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {

    private String name;
    private Integer quantity;
    private String description;
    private Double value;

}
