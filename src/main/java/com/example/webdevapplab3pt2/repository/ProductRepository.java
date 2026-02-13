package com.example.webdevapplab3pt2.repository;

import com.example.webdevapplab3pt2.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository <Product, Long>{

}
