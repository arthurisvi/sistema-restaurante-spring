package com.restaurantsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsystem.entities.OrderUser;

public interface OrderUserRepository extends JpaRepository<OrderUser, Long> {

}
