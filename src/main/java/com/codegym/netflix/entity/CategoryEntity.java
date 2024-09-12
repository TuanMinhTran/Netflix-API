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

    @Column(name = "src_path")
    private String path;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "categoryEntity")
    private List<MovieEntity> moviesEntity;

    public CategoryEntity() {
    }

    public CategoryEntity(Long id, String name, String path, String title, List<MovieEntity> moviesEntity) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.title = title;
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

    public List<MovieEntity> getMoviesEntity() {
        return moviesEntity;
    }

    public void setMoviesEntity(List<MovieEntity> moviesEntity) {
        this.moviesEntity = moviesEntity;
    }
}
