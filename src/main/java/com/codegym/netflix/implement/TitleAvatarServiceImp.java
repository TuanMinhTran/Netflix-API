package com.codegym.netflix.implement;

import com.codegym.netflix.converter.TitleAvatarConverter;
import com.codegym.netflix.dto.response.TitleAvatarResponseDto;
import com.codegym.netflix.entity.TitleAvatarEntity;
import com.codegym.netflix.repository.TitleAvatarRepository;
import com.codegym.netflix.service.TitleAvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TitleAvatarServiceImp implements TitleAvatarService {

    @Autowired
    private TitleAvatarRepository titleAvatarRepository;

    @Autowired
    private TitleAvatarConverter titleAvatarConverter;

    @Override
    public List<TitleAvatarResponseDto> findAllTitlesByAvatars() {
        List<TitleAvatarEntity> titles = (List<TitleAvatarEntity>) titleAvatarRepository.findAll();
        List<TitleAvatarResponseDto> dtos = new ArrayList<>();
        for (TitleAvatarEntity entity : titles) {
            TitleAvatarResponseDto dto = titleAvatarConverter.toDto(entity);
            dtos.add(dto);
        }
        return dtos;
    }
}
