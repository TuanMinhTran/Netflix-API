package com.codegym.netflix.dto.request;

public class CategoryRequestDto {
    private String name;
    private String path;
    private String title;

    public CategoryRequestDto(String name, String path, String title) {
        this.name = name;
        this.path = path;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
