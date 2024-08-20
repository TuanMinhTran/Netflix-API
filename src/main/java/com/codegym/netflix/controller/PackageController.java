package com.codegym.netflix.controller;

import com.codegym.netflix.dto.response.PackageResponseDto;
import com.codegym.netflix.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping("/packages")
    public ResponseEntity<List<PackageResponseDto>> getAllPackages() {
        List<PackageResponseDto> packages = packageService.findAllPackages();
        return ResponseEntity.ok(packages);
    }
}
