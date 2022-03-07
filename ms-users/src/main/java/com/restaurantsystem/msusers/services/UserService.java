package com.restaurantsystem.msusers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantsystem.msusers.entities.Order;
import com.restaurantsystem.msusers.entities.User;
import com.restaurantsystem.msusers.feignClient.OrderFeignClient;
import com.restaurantsystem.msusers.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Autowired
	private OrderFeignClient orderFeignClient;
	
	public List<User> findAll() {
		List<User> result = userRepository.findAll();
		return result;
	}
	
	public User findById(Long id) {
		User result = userRepository.findById(id).get();
		return result;
	}
	
	public User createUser(User newUser) {
		return userRepository.save(newUser);
	}
	
	public User updateUser(Long id, User updatedUser) {
		User user = userRepository.findById(id).get();
		user.setName(updatedUser.getName());
		user.setLogin(updatedUser.getLogin());
		user.setPassword(updatedUser.getPassword());
		user.setAddress(updatedUser.getAddress());
		user.setPhone(updatedUser.getPhone());
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public Order makeOrder(Order order, Long id){
		order.setUser_id(id);
		Order newOrder = orderFeignClient.createOrder(order);
		return newOrder;
	}
}
