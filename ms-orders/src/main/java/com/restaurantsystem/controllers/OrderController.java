package com.restaurantsystem.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantsystem.entities.Order;
import com.restaurantsystem.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	private OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> getAllOrders() {
		List<Order> result = orderService.getAllOrders();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
		Order result = orderService.getOrderById(id);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping
	public ResponseEntity<Order> createOrder(@RequestBody Order newOrder) {
		Order result = orderService.createOrder(newOrder);
		return ResponseEntity.ok(result);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
		orderService.deleteOrder(id);
		return ResponseEntity.noContent().build();
	}
}
