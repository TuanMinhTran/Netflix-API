package com.codegym.netflix.implement;

import com.codegym.netflix.converter.MovieConverter;
import com.codegym.netflix.dto.response.MovieResponseDto;
import com.codegym.netflix.entity.MovieEntity;
import com.codegym.netflix.repository.MovieRepository;
import com.codegym.netflix.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieConverter movieConverter;

    public List<MovieResponseDto> findAllMovies() {
        List<MovieEntity> movies = (List<MovieEntity>) movieRepository.findAll();
        return movieConverter.toDtoList(movies);
    }

    public MovieResponseDto getMovieById(Long movieId) {
        MovieEntity movieEntity = movieRepository.findById(movieId).get();
        return movieConverter.toDto(movieEntity);
    }
}
