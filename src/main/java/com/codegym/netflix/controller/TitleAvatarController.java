package com.codegym.netflix.controller;

import com.codegym.netflix.dto.response.TitleAvatarResponseDto;
import com.codegym.netflix.service.TitleAvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/titles")
public class TitleAvatarController {

    @Autowired
    private TitleAvatarService titleAvatarService;

    @GetMapping("/avatars")
    public ResponseEntity<List<TitleAvatarResponseDto>> getAllTitlesByAvatars() {
        List<TitleAvatarResponseDto> titles = titleAvatarService.findAllTitlesByAvatars();
        return ResponseEntity.ok(titles);
    }
}
