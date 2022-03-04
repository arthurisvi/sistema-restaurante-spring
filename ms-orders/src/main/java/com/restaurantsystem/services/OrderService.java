package com.restaurantsystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurantsystem.entities.Order;
import com.restaurantsystem.repositories.OrderRepository;

@Service
public class OrderService {
	private OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository) {	
		this.orderRepository = orderRepository;
	}
	
	public List<Order> getAllOrders() {
		List<Order> result = orderRepository.findAll();
		return result;
	}
	
	public Order getOrderById(Long id) {
		Order result = orderRepository.findById(id).get();
		return result;
	}
	
	public Order createOrder(Order newOrder) {
		Order order = orderRepository.save(newOrder);
		
		return order;
	}
	
	public Order updateOrder(Long id, Order updatedOrder) {
		Order actualOrder = orderRepository.findById(id).get();
		actualOrder.setUser_id(updatedOrder.getUser_id());
		actualOrder.setProducts(updatedOrder.getProducts());
		return orderRepository.save(actualOrder);
	}
	
	public void deleteOrder(Long id) {
		orderRepository.delete(orderRepository.findById(id).get());
	}
}
