package com.codegym.netflix.repository;

import com.codegym.netflix.entity.DeviceEntity;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<DeviceEntity, Long> {
}
