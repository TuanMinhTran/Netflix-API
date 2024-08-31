package com.codegym.netflix.dto.request;

public class TitleAvatarRequestDto {
    private String titleAvatar;

    public TitleAvatarRequestDto() {
    }

    public TitleAvatarRequestDto(String titleAvatar) {
        this.titleAvatar = titleAvatar;
    }

    public String getTitleAvatar() {
        return titleAvatar;
    }

    public void setTitleAvatar(String titleAvatar) {
        this.titleAvatar = titleAvatar;
    }
}
