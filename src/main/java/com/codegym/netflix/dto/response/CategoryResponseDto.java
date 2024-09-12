package com.codegym.netflix.dto.response;

import com.codegym.netflix.entity.MovieEntity;

import java.util.List;

public class CategoryResponseDto {
    private Long id;
    private String name;
    private String path;
    private String title;
    private List<MovieResponseDto> movies;

    public CategoryResponseDto() {
    }

    public CategoryResponseDto(Long id, String name, String path, String title, List<MovieResponseDto> movies) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.title = title;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MovieResponseDto> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieResponseDto> movies) {
        this.movies = movies;
    }
}
