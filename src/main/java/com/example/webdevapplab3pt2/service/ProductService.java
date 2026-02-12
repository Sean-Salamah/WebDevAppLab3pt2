package com.example.webdevapplab3pt2.service;

import com.example.webdevapplab3pt2.domain.Category;
import com.example.webdevapplab3pt2.domain.Product;
import com.example.webdevapplab3pt2.repository.CategoryRepository;
import com.example.webdevapplab3pt2.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository)
    {
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }

    public List<Product> getAllProducts(){return productRepository.findAll();}

    public Product createProduct(Long categoryid, Product product){
        Optional<Category> category = categoryRepository.findById(categoryid);

        product.setCategory(category);
        category.getProducts().add(product);

        return vcategoryRepository.save(product,);}
    }



