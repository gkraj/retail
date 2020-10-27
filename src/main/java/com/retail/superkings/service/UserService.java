package com.retail.superkings.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.superkings.entity.User;
import com.retail.superkings.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User saveProduct(String userId, String productName) {
		User userDetails = userRepo.findByuserId(userId);
		List<String> pl = new ArrayList<>();
		pl.add(productName);
		userDetails.setProductList(pl);
		return userRepo.save(userDetails);
	}
	
	public User removeProduct(String userId, String productName) {
		User userDetails = userRepo.findByuserId(userId);
		List<String> pl = new ArrayList<>();
		pl = userDetails.getProductList();
		pl.remove(productName);
		userDetails.setProductList(pl);
		return userRepo.save(userDetails);
	}

	public void newUser(Map<String, String> params) {
		User ur = new User(params.get("userId"), params.get("name"), params.get("password"));
		userRepo.save(ur);	
	}

	
}
