package com.codegym.netflix.implement;

import com.codegym.netflix.dto.request.PaymentRequestDto;
import com.codegym.netflix.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp implements PaymentService {
    @Override
    public void charge(PaymentRequestDto paymentRequest) {
    }
}
