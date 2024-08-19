package com.codegym.netflix.service;

import com.codegym.netflix.dto.response.PackageResponseDto;

import java.util.List;


public interface PackageService {
    List<PackageResponseDto> findAllPackages();
}
