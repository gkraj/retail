package com.retail.superkings.bean;

import java.util.Map;

public class CartBean {

	private String userId;
	private Map<String, Object> productsObj;
	
	public CartBean(String userId, Map<String, Object> productsObj) {
		super();
		this.userId = userId;
		this.productsObj = productsObj;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Map<String, Object> getProductsObj() {
		return productsObj;
	}
	public void setProductsObj(Map<String, Object> productsObj) {
		this.productsObj = productsObj;
	}
	
	
}
