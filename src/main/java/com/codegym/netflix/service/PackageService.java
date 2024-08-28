package com.codegym.netflix.service;

import com.codegym.netflix.dto.response.PackageResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PackageService {
    List<PackageResponseDto> findAllPackages();
    PackageResponseDto findPackageById(Long id);
    void selectPackage(Long userId, Long packageId);
}
