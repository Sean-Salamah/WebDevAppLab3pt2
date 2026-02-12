package com.example.webdevapplab3pt2.api;


import com.example.webdevapplab3pt2.domain.Category;
import com.example.webdevapplab3pt2.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController (CategoryService categoryService){this.categoryService = categoryService;}

    @GetMapping
    public List<Category> getAllCategory(){return categoryService.getAllCategories();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@RequestBody Category category){return categoryService.createCategory(category);}


}
