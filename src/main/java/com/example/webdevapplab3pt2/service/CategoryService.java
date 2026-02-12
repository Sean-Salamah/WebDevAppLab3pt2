package com.example.webdevapplab3pt2.service;

import com.example.webdevapplab3pt2.domain.Category;
import com.example.webdevapplab3pt2.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
     private final CategoryRepository categoryRepository;

     public CategoryService(CategoryRepository categoryRepository) {this.categoryRepository=categoryRepository;}

    public List<Category> getAllCategories(){return categoryRepository.findAll();}

    public Category createCategory(Category category)
    {
         categoryRepository.save(category);
        return category;
    }
}
