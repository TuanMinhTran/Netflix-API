package com.codegym.netflix.converter;

import com.codegym.netflix.dto.response.MovieResponseDto;
import com.codegym.netflix.entity.MovieEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieConverter {
    public MovieResponseDto toDto(MovieEntity movieEntity) {
        MovieResponseDto dto = new MovieResponseDto();
        dto.setId(movieEntity.getId());
        dto.setMovieUrl(movieEntity.getMovieUrl());
        dto.setThumbnailUrl(movieEntity.getMovieThumbnailUrl());
        dto.setTitle(movieEntity.getTitle());
        dto.setDescription(movieEntity.getDescriptions());
        dto.setPremiereYear(movieEntity.getPremiereYear());
        dto.setRuntime(movieEntity.getRuntime());
        dto.setCategoryId(movieEntity.getCategoryEntity() != null ? movieEntity.getCategoryEntity().getId() : null);
        return dto;
    }

    public List<MovieResponseDto> toDtoList(List<MovieEntity> movieEntities) {
        List<MovieResponseDto> dtoList = new ArrayList<>();
        for (MovieEntity movieEntity : movieEntities) {
            MovieResponseDto dto = toDto(movieEntity);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
