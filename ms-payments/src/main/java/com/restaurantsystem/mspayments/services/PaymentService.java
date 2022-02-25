package com.restaurantsystem.mspayments.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantsystem.mspayments.repositories.PaymentRepository;
import com.restaurantsystem.mspayments.entities.Payment;
import com.restaurantsystem.mspayments.entities.PaymentStatus;
import com.restaurantsystem.mspayments.entities.PaymentWay;

@Service
public class PaymentService implements PaymentInterfaceService{

    @Autowired
    private PaymentRepository paymentRepository;
    
    public List<Payment> findAll(){
        List<Payment> paymentsList = paymentRepository.findAll();

        return paymentsList;
    }

    public Payment findPaymentById(Long id){
        Optional <Payment> payment = paymentRepository.findById(id);
        
        return payment.get();
    }

    public void createPayment(Payment payment){
        if(payment.getId() == null){
            payment.setStatus(PaymentStatus.WAITING_PAYMENT);
            payment.setRequestDate(LocalDateTime.now());
        }

        paymentRepository.save(payment);
    }

    public Payment updatePayment(Long id, Payment updatePayment){
        Payment recoveredPayment = findPaymentById(id);

        recoveredPayment.setPaymentAt(updatePayment.getPaymentAt());
        recoveredPayment.setStatus(updatePayment.getStatus());
        recoveredPayment.setPaymentWay(updatePayment.getPaymentWay());

        System.out.println("updateStatus: " + recoveredPayment.getStatus());

        createPayment(recoveredPayment);

        return recoveredPayment;
    }

    public Payment updatePayedStatus(Long id){
        Payment recoveredPayment = findPaymentById(id);

        recoveredPayment.setStatus(PaymentStatus.PAYED);
        recoveredPayment.setPaymentAt(LocalDateTime.now());
        
        createPayment(recoveredPayment);

        return recoveredPayment;
    }

    public Payment updatePaymentWay(Long id, PaymentWay updateWay){
        Payment recoveredPayment = findPaymentById(id);

        recoveredPayment.setPaymentWay(updateWay);

        createPayment(recoveredPayment);

        return recoveredPayment;
    }

    public void deletePayment(Long id){
        Payment recoveredPayment = findPaymentById(id);

        paymentRepository.delete(recoveredPayment);
    }
}
