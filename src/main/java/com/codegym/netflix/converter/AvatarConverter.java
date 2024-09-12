package com.codegym.netflix.converter;

import com.codegym.netflix.dto.response.AvatarResponseDto;
import com.codegym.netflix.entity.AvatarsEntity;
import org.springframework.stereotype.Service;

@Service
public class AvatarConverter {
    public AvatarResponseDto toDto(AvatarsEntity avatarsEntity) {
        AvatarResponseDto avatarResponseDto = new AvatarResponseDto();
        avatarResponseDto.setId(avatarsEntity.getId());
        avatarResponseDto.setAvatarUrl(avatarsEntity.getAvatarUrl());
        return avatarResponseDto;
    }

    public AvatarsEntity toEntity(AvatarResponseDto avatarResponseDto) {
        AvatarsEntity avatarsEntity = new AvatarsEntity();
        avatarsEntity.setId(avatarResponseDto.getId());
        avatarsEntity.setAvatarUrl(avatarResponseDto.getAvatarUrl());
        return avatarsEntity;
    }
}
