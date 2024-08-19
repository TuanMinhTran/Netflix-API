package com.codegym.netflix.dto.response;

import java.util.List;

public class PackageResponseDto {
    private Long id;
    private String packName;
    private Double packPrice;
    private String quality;
    private String resolution;
    private List<Long> deviceIds;

    public PackageResponseDto() {
    }

    public PackageResponseDto(Long id, String packName, Double packPrice,
                              String resolution, String quality, List<Long> deviceIds) {
        this.id = id;
        this.packName = packName;
        this.packPrice = packPrice;
        this.resolution = resolution;
        this.quality = quality;
        this.deviceIds = deviceIds;
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

    public Double getPackPrice() {
        return packPrice;
    }

    public void setPackPrice(Double packPrice) {
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

    public List<Long> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<Long> deviceIds) {
        this.deviceIds = deviceIds;
    }
}
