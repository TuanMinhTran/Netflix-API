package com.codegym.netflix.repository;

import com.codegym.netflix.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<MovieEntity, Long> {
    List<MovieEntity> findByCategoryEntity(Long categoryEntity);
}

