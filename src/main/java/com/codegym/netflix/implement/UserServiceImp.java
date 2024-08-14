package com.codegym.netflix.service;

import com.codegym.netflix.converter.UserConverter;
import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.entity.UserEntity;
import com.codegym.netflix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public ResponseEntity<UserResponseDto> registerNewUser(UserRequestDto userRequestDto) {
        UserEntity newUser = userConverter.dtoToEntity(userRequestDto);
        newUser.setPassword(bCryptPasswordEncoder.encode(userRequestDto.getPassword()));

        UserEntity savedUser = userRepository.save(newUser);
        UserResponseDto responseDto = userConverter.entityToDto(savedUser);
        return ResponseEntity.ok(responseDto);
    }
}