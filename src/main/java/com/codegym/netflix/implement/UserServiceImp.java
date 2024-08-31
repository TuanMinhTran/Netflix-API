package com.codegym.netflix.implement;

import com.codegym.netflix.converter.UserConverter;
import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.entity.UserEntity;
import com.codegym.netflix.repository.UserRepository;
import com.codegym.netflix.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImp.class);
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<UserEntity> users = (List<UserEntity>) userRepository.findAll();
        List<UserResponseDto> userDtos = new ArrayList<>();

        for (UserEntity user : users) {
            UserResponseDto userDto = userConverter.entityToDto(user);
            userDtos.add(userDto);
        }

        return userDtos;
    }

    @Override
    public UserResponseDto registerNewUser(UserRequestDto userRequestDto) {
        UserEntity newUser = userConverter.dtoToEntity(userRequestDto);
        newUser.setPassword(bCryptPasswordEncoder.encode(userRequestDto.getPassword()));

        UserEntity savedUser = userRepository.save(newUser);
        return userConverter.entityToDto(savedUser);
    }

    @Override
    public UserResponseDto signIn(UserRequestDto userRequestDto) {
        Optional<UserEntity> userOptional = userRepository.findByEmail(userRequestDto.getEmail());

        if (!userOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Không tìm thấy tài khoản.");
        }

        UserEntity user = userOptional.get();

        if (!bCryptPasswordEncoder.matches(userRequestDto.getPassword(), user.getPassword())) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Mật khẩu không đúng.");
        }

        UserResponseDto userResponseDto = userConverter.entityToDto(user);
        return userResponseDto;
    }

    @Override
    public boolean isUserExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
