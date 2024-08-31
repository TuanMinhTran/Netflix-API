package com.codegym.netflix.converter;

import com.codegym.netflix.dto.response.AvatarResponseDto;
import com.codegym.netflix.dto.response.TitleAvatarResponseDto;
import com.codegym.netflix.entity.AvatarsEntity;
import com.codegym.netflix.entity.TitleAvatarEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TitleAvatarConverter {
    public TitleAvatarResponseDto toDto(TitleAvatarEntity entity) {
        TitleAvatarResponseDto dto = new TitleAvatarResponseDto();
        dto.setId(entity.getId());
        dto.setTitleAvatar(entity.getTitle());

        if (entity.getAvatars() != null && !entity.getAvatars().isEmpty()) {
            List<AvatarResponseDto> avatarDtos = new ArrayList<>();
            for (AvatarsEntity avatarEntity : entity.getAvatars()) {
                AvatarResponseDto avatarDto = avatarEntityToDto(avatarEntity);
                avatarDtos.add(avatarDto);
            }
            dto.setAvatars(avatarDtos);
        } else {
            dto.setAvatars(Collections.emptyList());
        }
        return dto;
    }

    private AvatarResponseDto avatarEntityToDto(AvatarsEntity entity) {
        AvatarResponseDto dto = new AvatarResponseDto();
        dto.setId(entity.getId());
        dto.setAvatarUrl(entity.getAvatarUrl());
        return dto;
    }
}
