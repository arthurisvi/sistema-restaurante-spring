package com.restaurantsystem.mspayments.services;

import java.util.List;

import com.restaurantsystem.mspayments.entities.Payment;
import com.restaurantsystem.mspayments.entities.PaymentWay;

public interface PaymentInterfaceService {
    public List<Payment> findAll();
    public Payment findPaymentById(Long id);
    public void createPayment(Payment payment);
    public Payment updatePayedStatus(Long id);
    public Payment updatePaymentWay(Long id, PaymentWay updateWay);
    public void deletePayment(Long id);
}
