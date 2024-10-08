package com.codegym.netflix.controller;

import com.codegym.netflix.dto.response.CategoryResponseDto;
import com.codegym.netflix.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    ResponseEntity<List<CategoryResponseDto>> getAllCategories() {
        List<CategoryResponseDto> listCategories = categoryService.findAll();
        return ResponseEntity.ok(listCategories);
    }
}
