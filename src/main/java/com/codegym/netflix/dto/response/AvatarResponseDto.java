package com.codegym.netflix.dto.response;

public class AvatarResponseDto {
    private Long id;
    private String avatarUrl;

    public AvatarResponseDto() {
    }

    public AvatarResponseDto(Long id, String avatarUrl) {
        this.id = id;
        this.avatarUrl = avatarUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
