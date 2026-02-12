package com.example.webdevapplab3pt2.domain;

import com.example.webdevapplab3pt2.api.CategoryController;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryid;

    private String categoryName;

    @OneToMany(mappedBy = "Category", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    private List<Product> products = new ArrayList<>();

    public Category()
    {
        this.categoryid = categoryid;
        this.categoryName = categoryName;

    }

    public Category(Long categoryid, String categoryName, List<Category> categories)
    {
        this.categoryid = categoryid;
        this.categoryName = categoryName;
    }

    public Long getCategoryid()
    {
        return categoryid;
    }

    public void setCategoryid(Long categoryid)
    {
        this.categoryid = categoryid;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
