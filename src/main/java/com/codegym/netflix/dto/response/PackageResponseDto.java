package com.codegym.netflix.dto.response;

import java.util.List;

public class PackageResponseDto {
    private Long id;
    private String packName;
    private Double packPrice;
    private String quality;
    private String resolution;
    private List<String> deviceNames;

    public PackageResponseDto() {
    }

    public PackageResponseDto(Long id, String packName, Double packPrice, String quality,
                              String resolution, List<String> deviceNames) {
        this.id = id;
        this.packName = packName;
        this.packPrice = packPrice;
        this.quality = quality;
        this.resolution = resolution;
        this.deviceNames = deviceNames;
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

    public List<String> getDeviceNames() {
        return deviceNames;
    }

    public void setDeviceNames(List<String> deviceNames) {
        this.deviceNames = deviceNames;
    }
}
