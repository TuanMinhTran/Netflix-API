package com.codegym.netflix.entity;

import javax.persistence.*;

@Entity
@Table(name = "package_device")
public class PackageDeviceEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageEntity packageEntity;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private DeviceEntity deviceEntity;

    public PackageDeviceEntity() {
    }

    public PackageDeviceEntity(Long id, PackageEntity packageEntity, DeviceEntity deviceEntity) {
        this.id = id;
        this.packageEntity = packageEntity;
        this.deviceEntity = deviceEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PackageEntity getPackageEntity() {
        return packageEntity;
    }

    public void setPackageEntity(PackageEntity packageEntity) {
        this.packageEntity = packageEntity;
    }

    public DeviceEntity getDeviceEntity() {
        return deviceEntity;
    }

    public void setDeviceEntity(DeviceEntity deviceEntity) {
        this.deviceEntity = deviceEntity;
    }
}
