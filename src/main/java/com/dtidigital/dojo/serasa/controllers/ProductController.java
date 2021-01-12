package com.dtidigital.dojo.serasa.controllers;

import com.dtidigital.dojo.serasa.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductController {

    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getProducts() {

        final List<Product> productList = new ArrayList<>();

        final Product product1 = Product.builder()
                .name("Lazanha")
                .description("Sabor bolonhesa, 150g")
                .quantity(215)
                .value(6.59)
                .build();

        final Product product = Product.builder()
                .name("Melancia")
                .description("Unit KG")
                .quantity(18)
                .value(13.85)
                .build();

        final Product product3 = Product.builder()
                .name("Arroz")
                .description("Unit KG")
                .quantity(5687)
                .value(32.59)
                .build();

        productList.add(product1);
        productList.add(product);
        productList.add(product3);

        return ResponseEntity.ok(productList);
    }

}
