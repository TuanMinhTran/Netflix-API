package com.codegym.netflix.controller;

import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<?>  registerUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        if (userService.isUserExists(userRequestDto.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Tài khoản với email này đã tồn tại.");
        }

        UserResponseDto userResponseDto = userService.registerNewUser(userRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userResponseDto);
    }

    @GetMapping("/signin")
    public UserResponseDto signInUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.signIn(userRequestDto);
    }
}