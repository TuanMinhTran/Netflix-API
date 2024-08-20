package com.codegym.netflix.converter;

import com.codegym.netflix.dto.response.PackageResponseDto;
import com.codegym.netflix.entity.DeviceEntity;
import com.codegym.netflix.entity.PackageDeviceEntity;
import com.codegym.netflix.entity.PackageEntity;
import com.codegym.netflix.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageConverter {

    @Autowired
    private DeviceService deviceService;

    public PackageResponseDto toDto(PackageEntity packageEntity) {
        List<String> devices = new ArrayList<>();

        for (PackageDeviceEntity dp : packageEntity.getPackageDevicesEntity()) {
            DeviceEntity deviceEntity = dp.getDeviceEntity();
            if (dp.getDeviceEntity() != null) {
                if (deviceEntity.getDevice1() != null) {
                    devices.add(deviceEntity.getDevice1());
                }
                if (deviceEntity.getDevice2() != null) {
                    devices.add(deviceEntity.getDevice2());
                }
                if (deviceEntity.getDevice3() != null) {
                    devices.add(deviceEntity.getDevice3());
                }
                if (deviceEntity.getDevice4() != null) {
                    devices.add(deviceEntity.getDevice4());
                }
            }
        }

        PackageResponseDto packageResponseDto = new PackageResponseDto();
        packageResponseDto.setId(packageEntity.getId());
        packageResponseDto.setPackName(packageEntity.getPackName());
        packageResponseDto.setPackPrice(packageEntity.getPackPrice());
        packageResponseDto.setQuality(packageEntity.getQuality());
        packageResponseDto.setResolution(packageEntity.getResolution());
        packageResponseDto.setDeviceNames(devices);

        return packageResponseDto;
    }

    public PackageEntity toEntity(PackageResponseDto packageResponseDto) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setPackName(packageResponseDto.getPackName());
        packageEntity.setPackPrice(packageResponseDto.getPackPrice());
        packageEntity.setQuality(packageResponseDto.getQuality());
        packageEntity.setResolution(packageResponseDto.getResolution());

        List<PackageDeviceEntity> packageDeviceEntities = new ArrayList<>();
        for (String deviceName : packageResponseDto.getDeviceNames()) {
            DeviceEntity deviceEntity = deviceService.findDeviceByName(deviceName);
            if (deviceEntity != null) {
                PackageDeviceEntity packageDeviceEntity = new PackageDeviceEntity();
                packageDeviceEntity.setDeviceEntity(deviceEntity);
                packageDeviceEntity.setPackageEntity(packageEntity);
                packageDeviceEntities.add(packageDeviceEntity);

            }
        }

        packageEntity.setPackageDevicesEntity(packageDeviceEntities);

        return packageEntity;
    }
}
