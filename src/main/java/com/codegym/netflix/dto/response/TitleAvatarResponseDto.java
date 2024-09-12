package com.codegym.netflix.dto.response;

import java.util.List;

public class TitleAvatarResponseDto {
    private Long id;
    private String titleAvatar;
    private List<AvatarResponseDto> avatars;

    public TitleAvatarResponseDto() {
    }

    public TitleAvatarResponseDto(Long id, String titleAvatar, List<AvatarResponseDto> avatars) {
        this.id = id;
        this.titleAvatar = titleAvatar;
        this.avatars = avatars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleAvatar() {
        return titleAvatar;
    }

    public void setTitleAvatar(String titleAvatar) {
        this.titleAvatar = titleAvatar;
    }

    public List<AvatarResponseDto> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<AvatarResponseDto> avatars) {
        this.avatars = avatars;
    }
}
