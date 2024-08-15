package com.codegym.netflix.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cate_name")
    private String name;

    @OneToMany(mappedBy = "categoryEntity")
    private List<MovieEntity> moviesEntity;

    public CategoryEntity() {
    }

    public CategoryEntity(Long id, String name, List<MovieEntity> moviesEntity) {
        this.id = id;
        this.name = name;
        this.moviesEntity = moviesEntity;
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

    public List<MovieEntity> getMoviesEntity() {
        return moviesEntity;
    }

    public void setMoviesEntity(List<MovieEntity> moviesEntity) {
        this.moviesEntity = moviesEntity;
    }
}
