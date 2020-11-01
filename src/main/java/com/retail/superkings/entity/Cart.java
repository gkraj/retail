package com.retail.superkings.entity;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cart")
public class Cart {

	@Id
	private String userId;
	private Double totalValue;
	private List<Map<String, String>> products;
	
	protected Cart(){
		
	}
	
	public Cart(String userId, Double totalValue, List<Map<String, String>> products) {
		super();
		this.userId = userId;
		this.totalValue = totalValue;
		this.products = products;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public List<Map<String, String>> getProducts() {
		return products;
	}
	public void setProducts(List<Map<String, String>> products) {
		this.products = products;
	}
	

	
}
