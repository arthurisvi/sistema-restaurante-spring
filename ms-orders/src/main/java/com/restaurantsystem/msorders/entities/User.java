package com.restaurantsystem.msorders.entities;

import java.time.Instant;

public class User {
	private String name;
	private String login;
	private String password;
	private Instant moment = Instant.now();
	private String address;
	private String phoneNumber;
	
	public User() {
		
	}
	
	public User(String name, String login, String password, String address, String phoneNumber) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Instant getMoment() {
		return moment;
	}
	
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
