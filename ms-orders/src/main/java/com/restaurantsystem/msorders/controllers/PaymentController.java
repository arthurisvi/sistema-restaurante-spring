package com.restaurantsystem.msorders.controllers;

import java.util.List;

import com.restaurantsystem.msorders.entities.Payment;
import com.restaurantsystem.msorders.feignClients.PaymentFeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentController {
    
    private PaymentFeignClient paymentClient;

    @GetMapping
    public ResponseEntity<List<Payment>> getAllPaymentss() {

        return paymentClient.getAllPayments();
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<Payment> findById(@PathVariable Long id){

        return paymentClient.findById(id);
    }
}
