package com.codegym.netflix.service;

import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto registerNewUser(UserRequestDto userRequestDto);
    UserResponseDto signIn(UserRequestDto userRequestDto);
    boolean isUserExists(String email);
    List<UserResponseDto> getAllUsers();
}
