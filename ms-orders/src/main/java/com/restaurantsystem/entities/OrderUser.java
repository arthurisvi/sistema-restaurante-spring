package com.restaurantsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order_user")
public class OrderUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long user_id;
	private Long order_id;
	
	public OrderUser() {
		
	}
	
	public OrderUser(Long user_id, Long order_id) {
		super();
		this.user_id = user_id;
		this.order_id = order_id;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUser_id() {
		return user_id;
	}
	
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	public Long getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
}
