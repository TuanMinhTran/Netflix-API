package com.codegym.netflix.converter;

import com.codegym.netflix.dto.response.CategoryResponseDto;
import com.codegym.netflix.dto.response.MovieResponseDto;
import com.codegym.netflix.entity.CategoryEntity;
import com.codegym.netflix.entity.MovieEntity;
import com.codegym.netflix.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CategoryConverter {

    @Autowired
    private MovieRepository movieRepository;

    public CategoryResponseDto toDto(CategoryEntity entity) {

        MovieConverter movieConverter = new MovieConverter();

        CategoryResponseDto dto = new CategoryResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setTitle(entity.getTitle());
        dto.setPath(entity.getPath());

        List<MovieResponseDto> movieDtos;

        if (entity.getMoviesEntity() == null || entity.getMoviesEntity().isEmpty()) {
            List<MovieEntity> allMovies = (List<MovieEntity>) movieRepository.findAll();
            movieDtos = new ArrayList<>();
            for (MovieEntity movieEntity : allMovies) {
                MovieResponseDto movieDto = movieConverter.toDto(movieEntity);
                movieDtos.add(movieDto);
            }
        } else {
            movieDtos = new ArrayList<>();
            for (MovieEntity movieEntity : entity.getMoviesEntity()) {
                MovieResponseDto movieDto = movieConverter.toDto(movieEntity);
                movieDtos.add(movieDto);
            }
        }

        dto.setMovies(movieDtos);
        return dto;
    }
}
