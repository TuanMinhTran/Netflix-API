package com.codegym.netflix.implement;

import com.codegym.netflix.converter.PackageConverter;
import com.codegym.netflix.dto.response.PackageResponseDto;
import com.codegym.netflix.entity.PackageEntity;
import com.codegym.netflix.entity.UserEntity;
import com.codegym.netflix.repository.PackageRepository;
import com.codegym.netflix.repository.UserRepository;
import com.codegym.netflix.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageServiceImp implements PackageService {

    @Autowired
    private PackageRepository packageRepository;

    @Autowired
    private PackageConverter packageConverter;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<PackageResponseDto> findAllPackages() {
        List<PackageEntity> packages = (List<PackageEntity>) packageRepository.findAll();
        List<PackageResponseDto> packageResponseDtos = new ArrayList<>();

        for (PackageEntity packageEntity : packages) {
            PackageResponseDto packageResponseDto = packageConverter.toDto(packageEntity);
            packageResponseDtos.add(packageResponseDto);
        }

        return packageResponseDtos;
    }

    @Override
    public PackageResponseDto findPackageById(Long id) {
        PackageEntity packageEntity = packageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Package not found"));
        return packageConverter.toDto(packageEntity);
    }

    @Override
    public void selectPackage(Long userId, Long packageId) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        PackageEntity packageEntity = packageRepository.findById(packageId)
                .orElseThrow(() -> new RuntimeException("Package not found"));
        userEntity.setPackageEntity(packageEntity);
        userRepository.save(userEntity);
    }
}
