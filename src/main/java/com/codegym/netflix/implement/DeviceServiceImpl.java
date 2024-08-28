package com.codegym.netflix.implement;

import com.codegym.netflix.entity.DeviceEntity;
import com.codegym.netflix.repository.DeviceRepository;
import com.codegym.netflix.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl extends DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public DeviceEntity findDeviceByName(String deviceName) {
        return deviceRepository.findByDeviceName(deviceName).orElse(null);
    }
}
