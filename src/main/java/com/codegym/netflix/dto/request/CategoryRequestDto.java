package com.codegym.netflix.dto.request;

public class CategoryRequestDto {
    private String name;

    public CategoryRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
