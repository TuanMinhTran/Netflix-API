package com.codegym.netflix.implement;

import com.codegym.netflix.converter.CategoryConverter;
import com.codegym.netflix.dto.response.CategoryResponseDto;
import com.codegym.netflix.entity.CategoryEntity;
import com.codegym.netflix.repository.CategoryRepository;
import com.codegym.netflix.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryConverter categoryConverter;

    @Override
    public List<CategoryResponseDto> findAll() {
        List<CategoryEntity> categories = (List<CategoryEntity>) categoryRepository.findAll();
        List<CategoryResponseDto> responseDto = new ArrayList<>();
        for (CategoryEntity categoryEntity : categories) {
            CategoryResponseDto response = categoryConverter.toDto(categoryEntity);
            responseDto.add((response));
        }
        return responseDto;
    }
}
