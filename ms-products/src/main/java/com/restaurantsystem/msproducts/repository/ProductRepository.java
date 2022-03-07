package com.restaurantsystem.msproducts.repository;

import java.util.List;

import com.restaurantsystem.msproducts.entities.Category;
import com.restaurantsystem.msproducts.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    @Query("select p from Product p where p.category = :category")
    List<Product> findByCategory(@Param ("category") Category category);
}
