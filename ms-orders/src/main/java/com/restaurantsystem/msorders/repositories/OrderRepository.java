package com.restaurantsystem.msorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsystem.msorders.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
