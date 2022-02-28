package com.restaurantsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
