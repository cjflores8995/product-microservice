package com.cjfg.msa.product_microservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    @Id
    private String id;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("productDescription")
    private String productDescription;

    @JsonProperty("unitPrice")
    private Double unitPrice;
}

