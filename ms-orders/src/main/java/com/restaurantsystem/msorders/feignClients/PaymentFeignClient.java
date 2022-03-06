package com.restaurantsystem.msorders.feignClients;

import java.util.List;

import com.restaurantsystem.msorders.entities.Payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "payments", url = "localhost:8080", path = "/payments")
public interface PaymentFeignClient {
    
    @GetMapping
    ResponseEntity<List<Payment>> getAllPayments();

    @GetMapping(value= "/{id}")
    Payment findById(@PathVariable Long id);

    @PostMapping
    Payment createPayment(@RequestBody Payment payment);
}
