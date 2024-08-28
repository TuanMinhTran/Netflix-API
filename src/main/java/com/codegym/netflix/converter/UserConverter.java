package com.codegym.netflix.converter;

import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {

    public UserEntity dtoToEntity(UserRequestDto userRequestDto) {
        UserEntity user = new UserEntity();
        user.setEmail(userRequestDto.getEmail());
        user.setPassword(userRequestDto.getPassword());
        return user;
    }

    public UserResponseDto entityToDto(UserEntity user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        return dto;
    }
}