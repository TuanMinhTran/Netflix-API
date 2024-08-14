package com.codegym.netflix.implement;

import com.codegym.netflix.converter.UserConverter;
import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.entity.UserEntity;
import com.codegym.netflix.repository.UserRepository;
import com.codegym.netflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserResponseDto registerNewUser(UserRequestDto userRequestDto) {
        UserEntity newUser = userConverter.dtoToEntity(userRequestDto);
        newUser.setPassword(bCryptPasswordEncoder.encode(userRequestDto.getPassword()));

        UserEntity savedUser = userRepository.save(newUser);
        return userConverter.entityToDto(savedUser);
    }

    @Override
    public boolean isUserExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}