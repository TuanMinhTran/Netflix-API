package com.codegym.netflix.service;

import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;

public interface UserService {
    UserResponseDto registerNewUser(UserRequestDto userRequestDto);

    boolean isUserExists(String email);
}
