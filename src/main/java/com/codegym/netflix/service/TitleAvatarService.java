package com.codegym.netflix.service;

import com.codegym.netflix.dto.response.TitleAvatarResponseDto;

import java.util.List;

public interface TitleAvatarService {
    List<TitleAvatarResponseDto> findAllTitlesByAvatars();
}
