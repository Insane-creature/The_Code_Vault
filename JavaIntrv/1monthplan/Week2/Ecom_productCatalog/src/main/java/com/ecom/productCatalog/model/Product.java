package com.ecom.productCatalog.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product {
     private Long id;
     private String name;
     private String Description;
     private String ImageUrl;
     private Double price;

}
