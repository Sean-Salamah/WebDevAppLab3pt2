package com.example.webdevapplab3pt2.api;

import com.example.webdevapplab3pt2.domain.Product;
import com.example.webdevapplab3pt2.service.ProductService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getAllProducts(){return productService.getAllProducts();}

    @PostMapping("/products/{categoryid}")
    public Product addProductToLibrary(@PathVariable Long categoryid, @Validated @RequestBody Product product)
    {
        return productService.createProduct(categoryid,product);
    }
}
