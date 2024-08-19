package com.codegym.netflix.dto.request;

import java.math.BigDecimal;

public class PaymentRequestDto {

    private Long userId;
    private BigDecimal amount; // Số tiền cần thanh toán
    private String paymentMethod; // Phương thức thanh toán (Credit Card, PayPal, etc.)
    private String currency; // Loại tiền tệ (USD, VND, etc.)
    private String description; // Mô tả ngắn về giao dịch thanh toán

    public PaymentRequestDto() {
    }

    public PaymentRequestDto(Long userId, BigDecimal amount, String paymentMethod, String currency, String description) {
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.currency = currency;
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
