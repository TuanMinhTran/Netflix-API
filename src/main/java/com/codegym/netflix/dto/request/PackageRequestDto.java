package com.codegym.netflix.dto.request;

public class PackageRequestDto {
    private String packName;
    private Double packPrice;
    private String quality;
    private String resolution;
    private Long userId;
    private Long packageId;

    public PackageRequestDto() {
    }

    public PackageRequestDto(Long userId, Long packageId, String packName, Double packPrice, String quality, String resolution) {
        this.userId = userId;
        this.packageId = packageId;
        this.packName = packName;
        this.packPrice = packPrice;
        this.quality = quality;
        this.resolution = resolution;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
