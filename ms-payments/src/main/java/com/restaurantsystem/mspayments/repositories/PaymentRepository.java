package com.restaurantsystem.mspayments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsystem.mspayments.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{}
