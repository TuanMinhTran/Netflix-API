package com.codegym.netflix.service;

import com.codegym.netflix.dto.response.CategoryResponseDto;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDto> findAll();
}
