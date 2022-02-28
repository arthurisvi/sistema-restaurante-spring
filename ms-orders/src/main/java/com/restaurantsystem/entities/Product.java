package com.restaurantsystem.entities;

import java.math.BigDecimal;

public class Product {	
	private String name;
	private String imageUrl;
	private BigDecimal price;
	private Category category;
	private String description;
	
	public Product() {
		
	}
	
	public Product(String name, String imageUrl, BigDecimal price, Category category, String description) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.category = category;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
