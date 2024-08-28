package com.codegym.netflix.entity;

import javax.persistence.*;

@Entity
@Table (name = "movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_movie")
    private String movieUrl;

    @Column(name = "url_thumbnail")
    private String movieThumbnailUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "premiere_year")
    private String premiereYear;

    @Column(name = "runtime")
    private String runtime;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    public MovieEntity() {
    }

    public MovieEntity(Long id, String title, String movieThumbnailUrl, String movieUrl, String premiereYear,
                       String runtime, String descriptions, CategoryEntity categoryEntity) {
        this.id = id;
        this.title = title;
        this.movieThumbnailUrl = movieThumbnailUrl;
        this.movieUrl = movieUrl;
        this.premiereYear = premiereYear;
        this.runtime = runtime;
        this.descriptions = descriptions;
        this.categoryEntity = categoryEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieThumbnailUrl() {
        return movieThumbnailUrl;
    }

    public void setMovieThumbnailUrl(String movieThumbnailUrl) {
        this.movieThumbnailUrl = movieThumbnailUrl;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getPremiereYear() {
        return premiereYear;
    }

    public void setPremiereYear(String premiereYear) {
        this.premiereYear = premiereYear;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }
}
