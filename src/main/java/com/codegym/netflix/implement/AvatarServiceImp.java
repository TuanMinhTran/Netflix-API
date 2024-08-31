package com.codegym.netflix.implement;

import com.codegym.netflix.converter.AvatarConverter;
import com.codegym.netflix.dto.response.AvatarResponseDto;
import com.codegym.netflix.entity.AvatarsEntity;
import com.codegym.netflix.repository.AvatarRepository;
import com.codegym.netflix.service.AvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AvatarServiceImp implements AvatarService {

    @Autowired
    private AvatarRepository avatarRepository;

    @Autowired
    private AvatarConverter avatarConverter;

    @Override
    public List<AvatarResponseDto> findAllAvatars() {
        List<AvatarsEntity> avatars = (List<AvatarsEntity>) avatarRepository.findAll();
        List<AvatarResponseDto> avatarResponseDto = new ArrayList<>();
        for (AvatarsEntity avatar : avatars) {
            AvatarResponseDto dto = avatarConverter.toDto(avatar);
            avatarResponseDto.add(dto);
        }
        return avatarResponseDto;
    }

    @Override
    public Optional<AvatarsEntity> findAvatarById(Long id) {
        return avatarRepository.findById(id);
    }
}
