package com.codegym.netflix.service;

import com.codegym.netflix.converter.UserConverter;
import com.codegym.netflix.dto.request.UserRequestDto;
import com.codegym.netflix.dto.response.UserResponseDto;
import com.codegym.netflix.entity.UserEntity;
import com.codegym.netflix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public UserResponseDto registerNewUser(UserRequestDto userRequestDto) {
        UserEntity newUser = userConverter.dtoToEntity(userRequestDto);

        String hashedPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
        newUser.setPassword(hashedPassword);

        UserEntity savedUser = userRepository.save(newUser);
        return userConverter.entityToDto(savedUser);
    }

    @Override
    public UserResponseDto signin(UserRequestDto userRequestDto) {
        // Tìm User trong cơ sở dữ liệu bằng email
        UserEntity user = userRepository.findByEmail(userRequestDto.getEmail());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        // Kiểm tra mật khẩu
        if (!bCryptPasswordEncoder.matches(userRequestDto.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        // Trả về thông tin người dùng
        return userConverter.entityToDto(user);
    }
}
