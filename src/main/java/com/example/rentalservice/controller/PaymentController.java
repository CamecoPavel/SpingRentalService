
package com.example.rentalservice.controller;

import com.example.rentalservice.model.Payment;
import com.example.rentalservice.repository.PaymentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @GetMapping
    public List<Payment> all() { return paymentRepository.findAll(); }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Payment p) {
        return ResponseEntity.ok(paymentRepository.save(p));
    }
}
