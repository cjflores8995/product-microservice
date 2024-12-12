package com.cjfg.msa.product_microservice.controller;

import com.cjfg.msa.product_microservice.entity.ProductEntity;
import com.cjfg.msa.product_microservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity) {
        if (productEntity != null) {
            System.out.println("Producto: " + productEntity);
            productRepository.save(productEntity);
        } else {
            System.out.println("El producto es null");
        }

    }

}
