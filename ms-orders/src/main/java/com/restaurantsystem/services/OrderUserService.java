package com.restaurantsystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurantsystem.entities.OrderUser;
import com.restaurantsystem.repositories.OrderUserRepository;

@Service
public class OrderUserService {
	private OrderUserRepository orderUserRepository;
	
	public OrderUserService(OrderUserRepository orderUserRepository) {
		this.orderUserRepository = orderUserRepository;
	}
	
	public List<OrderUser> getAllOrderUser() {
		List<OrderUser> result = orderUserRepository.findAll();
		return result;
	}
	
	public OrderUser getOrderUser(Long id) {
		OrderUser result = orderUserRepository.findById(id).get();
		return result;
	}
	
	public OrderUser createOrderUser(OrderUser orderUser) {
		return orderUserRepository.save(orderUser);
	}
	
	public void deleteOrderUser(Long id) {
		orderUserRepository.deleteById(id);
	}
}
