package com.restaurantsystem.msorders.feignClients;

import com.restaurantsystem.msorders.entities.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "products", url = "http://localhost:8082", path = "/products")
public interface ProductFeignClient {
    
    @GetMapping("/{id}")
    Product getProductById(@PathVariable Long id); 


}
