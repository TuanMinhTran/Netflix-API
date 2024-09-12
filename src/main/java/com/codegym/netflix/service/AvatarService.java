package com.codegym.netflix.service;

import com.codegym.netflix.dto.response.AvatarResponseDto;
import com.codegym.netflix.entity.AvatarsEntity;

import java.util.List;
import java.util.Optional;

public interface AvatarService {
    List<AvatarResponseDto> findAllAvatars();
    Optional<AvatarsEntity> findAvatarById(Long id);
}
