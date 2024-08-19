package com.codegym.netflix.dto.request;

public class PackageRequestDto {
    private String packName;
    private Double packPrice;
    private String quality;
    private String resolution;

    public PackageRequestDto() {
    }

    public PackageRequestDto(String packName, Double packPrice, String resolution, String quality) {
        this.packName = packName;
        this.packPrice = packPrice;
        this.resolution = resolution;
        this.quality = quality;
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
}
