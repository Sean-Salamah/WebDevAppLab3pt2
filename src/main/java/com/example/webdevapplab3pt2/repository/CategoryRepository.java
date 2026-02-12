package com.example.webdevapplab3pt2.repository;

import com.example.webdevapplab3pt2.domain.Category;
import com.example.webdevapplab3pt2.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Product> findByCategoryId(Long categoryid);


}
