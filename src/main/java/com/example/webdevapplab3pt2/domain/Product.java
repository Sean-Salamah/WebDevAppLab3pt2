package com.example.webdevapplab3pt2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long productid;

    private String productDescription;
    private double productPrice;

    @ManyToOne(optional = false)
    @JoinColumn(name = "categoryid")
    @JsonBackReference
    private Category category;

    public Product()
    {
        this.productid=productid;
        this.productDescription=productDescription;
        this.productPrice=productPrice;
        this.category=category;
    }

    public Product(Long productid, String productDescription, double productPrice, Category category)
    {
        this.productid=productid;
        this.productDescription=productDescription;
        this.productPrice=productPrice;
        this.category=category;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}


