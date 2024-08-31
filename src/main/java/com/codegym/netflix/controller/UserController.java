package com.codegym.netflix.controller;

import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        List<UserResponseDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/check-email")
    public ResponseEntity<String> checkUserByEmail(@RequestParam("check-email") String email) {
        if (userService.isUserExists(email)) {
            return ResponseEntity.ok("exists");
        } else {
            return ResponseEntity.ok("not exists");
        }
    }

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

    @PostMapping("/signin")
    ResponseEntity<?> signInUser(@RequestBody UserRequestDto userRequestDto) {
        try {
            UserResponseDto response = userService.signIn(userRequestDto);
            return ResponseEntity.ok(response);
        } catch (ResponseStatusException e) {
            return ResponseEntity.status(e.getStatus()).body(e.getReason());
        }
    }
}