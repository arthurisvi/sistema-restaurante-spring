package com.restaurantsystem.mspayments.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.restaurantsystem.mspayments.entities.Payment;
import com.restaurantsystem.mspayments.entities.PaymentWay;
import com.restaurantsystem.mspayments.services.PaymentService;

@RestController
@RequestMapping (value = "/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<Payment>> findAllPayments(){

        List<Payment> paymentsList = paymentService.findAll();

        return ResponseEntity.ok(paymentsList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> findPaymentById(@PathVariable Long id){
        Payment payment = paymentService.findPaymentById(id);

        return ResponseEntity.ok(payment);
    }

    @PostMapping
    public ResponseEntity<Payment> createPayment (@RequestBody Payment payment){
        paymentService.createPayment(payment);

        URI location = URI.create(String.format("/payments/%s", payment.getId()));

        return ResponseEntity.created(location).body(payment);
    }

    @PutMapping ("/{id}")   
    public ResponseEntity<Payment> updatePayment(@PathVariable Long id, @RequestBody Payment payment){

        return ResponseEntity.ok(paymentService.updatePayment(id, payment));
    }

    @PatchMapping ("/{id}/update-payed-status")
    public ResponseEntity<Payment> updatePayedStatus(@PathVariable Long id){

        return ResponseEntity.ok(paymentService.updatePayedStatus(id));
    }

    @PatchMapping ("/{id}/update-payment-way")
    public ResponseEntity<Payment> updatePaymentWay(@PathVariable Long id, @RequestBody PaymentWay paymentWay){

        return ResponseEntity.ok(paymentService.updatePaymentWay(id, paymentWay));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Payment> deletePayment(@PathVariable Long id){
        paymentService.deletePayment(id);

        return ResponseEntity.noContent().build();
    }
}
