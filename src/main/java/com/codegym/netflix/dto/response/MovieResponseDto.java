package com.codegym.netflix.dto.response;

public class MovieResponseDto {
    private Long id;
    private String movieUrl;
    private String thumbnailUrl;
    private String title;
    private String description;
    private String premiereYear;
    private String runtime;
    private Long categoryId;

    public MovieResponseDto() {
    }

    public MovieResponseDto(Long id, String title, String thumbnailUrl, String movieUrl, String description,
                            String premiereYear, String runtime, Long categoryId) {
        this.id = id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.movieUrl = movieUrl;
        this.description = description;
        this.premiereYear = premiereYear;
        this.runtime = runtime;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
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

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
