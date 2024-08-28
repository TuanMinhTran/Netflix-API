package com.codegym.netflix.controller;

import com.codegym.netflix.dto.request.PackageRequestDto;
import com.codegym.netflix.dto.response.PackageResponseDto;
import com.codegym.netflix.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/packages/{id}")
    public ResponseEntity<PackageResponseDto> getPackageById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(packageService.findPackageById(id));
    }

    @PostMapping("/select")
    public ResponseEntity<Void> optionPackage(@RequestBody PackageRequestDto packageRequestDto) {
        Long userId = packageRequestDto.getUserId();
        Long packageId = packageRequestDto.getPackageId();

        System.out.println("Received userId: " + packageRequestDto.getUserId());
        System.out.println("Received packageId: " + packageRequestDto.getPackageId());

        packageService.selectPackage(userId, packageId);
        return ResponseEntity.ok().build();
    }
}
