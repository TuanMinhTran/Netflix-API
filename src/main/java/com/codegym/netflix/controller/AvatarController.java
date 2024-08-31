package com.codegym.netflix.controller;

import com.codegym.netflix.dto.response.AvatarResponseDto;
import com.codegym.netflix.entity.AvatarsEntity;
import com.codegym.netflix.service.AvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AvatarController {

    @Autowired
    private AvatarService avatarService;

    @GetMapping("/avatars")
    public ResponseEntity<List<AvatarResponseDto>> getAllAvatars() {
        List<AvatarResponseDto> avatars = avatarService.findAllAvatars();
        return ResponseEntity.ok(avatars);
    }

    @GetMapping("/avatars/{id}")
    public ResponseEntity<AvatarsEntity> getAvatarById(@PathVariable("id") Long id) {
        Optional<AvatarsEntity> avatar = avatarService.findAvatarById(id);
        if (avatar.isPresent()) {
            return ResponseEntity.ok(avatar.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
