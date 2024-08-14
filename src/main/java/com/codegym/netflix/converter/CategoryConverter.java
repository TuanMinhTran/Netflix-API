package com.codegym.netflix.converter;

import com.codegym.netflix.dto.request.CategoryRequestDto;
import com.codegym.netflix.dto.response.CategoryResponseDto;
import com.codegym.netflix.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryConverter {
    public CategoryResponseDto toDto(CategoryEntity categoryEntity) {
        return new CategoryResponseDto(categoryEntity.getId(), categoryEntity.getName());
    }

//    public List<CategoryResponseDto> toDtoList(List<CategoryEntity> categoryEntities) {
//        List<CategoryResponseDto> categoryResponseDto = new ArrayList<>();
//        for (CategoryEntity categoryEntity : categoryEntities) {
//            categoryResponseDto.add(toDto(categoryEntity));
//        }
//        return categoryResponseDto;
//    }
}
