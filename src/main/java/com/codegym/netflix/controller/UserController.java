package com.codegym.netflix.controller;

import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserResponseDto registerUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        return userService.registerNewUser(userRequestDto);
    }

    @GetMapping("/signin")
    public UserResponseDto signInUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.signin(userRequestDto);
    }
}
