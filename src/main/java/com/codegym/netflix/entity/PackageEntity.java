package com.codegym.netflix.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "packages")
public class PackageEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pack_name")
    private String packName;

    @Column(name = "pack_price")
    private double packPrice;

    @Column(name = "quality")
    private String quality;

    @Column(name = "resolation")
    private String resolution;

    @OneToMany(mappedBy = "packageEntity")
    private List<PackageDeviceEntity> packageDevicesEntity;

    public PackageEntity() {
    }

    public PackageEntity(Long id, double packPrice, String packName, String quality,
                         String resolution, List<PackageDeviceEntity> packageDevicesEntity) {
        this.id = id;
        this.packPrice = packPrice;
        this.packName = packName;
        this.quality = quality;
        this.resolution = resolution;
        this.packageDevicesEntity = packageDevicesEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    public double getPackPrice() {
        return packPrice;
    }

    public void setPackPrice(double packPrice) {
        this.packPrice = packPrice;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public List<PackageDeviceEntity> getPackageDevicesEntity() {
        return packageDevicesEntity;
    }

    public void setPackageDevicesEntity(List<PackageDeviceEntity> packageDevicesEntity) {
        this.packageDevicesEntity = packageDevicesEntity;
    }
}
