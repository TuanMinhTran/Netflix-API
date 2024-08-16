package com.codegym.netflix.service;

import com.codegym.netflix.dto.response.MovieResponseDto;

import java.util.List;

public interface MovieService {
    List<MovieResponseDto> findAllMovies();
    MovieResponseDto getMovieById(Long id);
}
