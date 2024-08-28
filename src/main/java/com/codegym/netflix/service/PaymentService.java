package com.codegym.netflix.service;

import com.codegym.netflix.dto.request.PaymentRequestDto;

public interface PaymentService {
    void charge(PaymentRequestDto paymentRequest);
}