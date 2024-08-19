package com.codegym.netflix.controller;

import com.codegym.netflix.dto.request.PaymentRequestDto;
import com.codegym.netflix.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/charge")
    public ResponseEntity<String> charge(@RequestBody PaymentRequestDto paymentRequest) {
        paymentService.charge(paymentRequest);
        return ResponseEntity.ok("Payment successful, subscription upgraded.");
    }
}
