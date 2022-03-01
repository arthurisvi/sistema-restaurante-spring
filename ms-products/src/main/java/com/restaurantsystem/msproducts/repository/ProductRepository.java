package com.restaurantsystem.msproducts.repository;

import com.restaurantsystem.msproducts.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
