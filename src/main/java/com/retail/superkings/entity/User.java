package com.retail.superkings.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

	@Id
	//private Object _id;
	private String userId;
	private String userName;
	private String userPw;
	private List<String> productList;
	
	protected User() {
		
	}

	public User(String userid, String userName, String userPw) {
		super();
		this.userId = userid;
		this.userName = userName;
		this.userPw = userPw;
	}

	public String getUserid() {
		return userId;
	}

	public void setUserid(String userid) {
		this.userId = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPw == null) ? 0 : userPw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (productList == null) {
			if (other.productList != null)
				return false;
		} else if (!productList.equals(other.productList))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPw == null) {
			if (other.userPw != null)
				return false;
		} else if (!userPw.equals(other.userPw))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [ userId=" + userId + ", userName=" + userName + ", userPw=" + userPw
				+ ", productList=" + productList + "]";
	}
	
	
	
}

