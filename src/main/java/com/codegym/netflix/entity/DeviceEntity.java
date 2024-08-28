package com.codegym.netflix.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "devices")
public class DeviceEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "device_1")
    private String device1;

    @Column(name = "device_2")
    private String device2;

    @Column(name = "device_3")
    private String device3;

    @Column(name = "device_4")
    private String device4;

    @OneToMany(mappedBy = "deviceEntity")
    private List<PackageDeviceEntity> packageDevicesEntity;

    public DeviceEntity() {
    }

    public DeviceEntity(Long id, String device1, String device2, String device3,
                        String device4, List<PackageDeviceEntity> packageDevicesEntity) {
        this.id = id;
        this.device1 = device1;
        this.device2 = device2;
        this.device3 = device3;
        this.device4 = device4;
        this.packageDevicesEntity = packageDevicesEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevice1() {
        return device1;
    }

    public void setDevice1(String device1) {
        this.device1 = device1;
    }

    public String getDevice2() {
        return device2;
    }

    public void setDevice2(String device2) {
        this.device2 = device2;
    }

    public String getDevice3() {
        return device3;
    }

    public void setDevice3(String device3) {
        this.device3 = device3;
    }

    public String getDevice4() {
        return device4;
    }

    public void setDevice4(String device4) {
        this.device4 = device4;
    }

    public List<PackageDeviceEntity> getPackageDevicesEntity() {
        return packageDevicesEntity;
    }

    public void setPackageDevicesEntity(List<PackageDeviceEntity> packageDevicesEntity) {
        this.packageDevicesEntity = packageDevicesEntity;
    }
}
