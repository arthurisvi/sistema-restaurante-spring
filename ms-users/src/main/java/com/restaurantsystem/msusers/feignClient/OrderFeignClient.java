package com.restaurantsystem.msusers.feignClient;

import com.restaurantsystem.msusers.entities.Order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "order", url = "http://localhost:8101", path = "/orders")
public interface OrderFeignClient {
    
    @PostMapping
    Order createOrder(@RequestBody Order order);
}
