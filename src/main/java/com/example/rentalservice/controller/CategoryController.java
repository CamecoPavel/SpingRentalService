
package com.example.rentalservice.controller;

import com.example.rentalservice.model.Category;
import com.example.rentalservice.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public List<Category> all() { return categoryRepository.findAll(); }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Category c) {
        return ResponseEntity.ok(categoryRepository.save(c));
    }
}
