package com.codegym.netflix.controller;

import com.codegym.netflix.dto.response.MovieResponseDto;
import com.codegym.netflix.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<MovieResponseDto>> getAllMovies(){
        List<MovieResponseDto> movie = movieService.findAllMovies();
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<MovieResponseDto> getMovieById(@PathVariable("id") Long movieId) {
        MovieResponseDto movieResponseDto = movieService.getMovieById(movieId);
        return ResponseEntity.ok(movieResponseDto);
    }
}
