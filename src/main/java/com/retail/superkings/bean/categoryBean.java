package com.retail.superkings.bean;

import java.util.List;

public class categoryBean {
	
	private String categoryName;
	private List<String> productsName;
	
	protected categoryBean() {
		
	}
	
	public categoryBean(String categoryName, List<String> productsName) {
		super();
		this.categoryName = categoryName;
		this.productsName = productsName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<String> getProductsName() {
		return productsName;
	}

	public void setProductsName(List<String> productsName) {
		this.productsName = productsName;
	}
	
	

}
