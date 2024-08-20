package com.codegym.netflix.repository;

import com.codegym.netflix.entity.DeviceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DeviceRepository extends CrudRepository<DeviceEntity, Long> {
    @Query("SELECT d FROM DeviceEntity d JOIN d.packageDevicesEntity dn WHERE dn = :deviceName")
    Optional<DeviceEntity> findByDeviceName(@Param("deviceName") String deviceName);
}
