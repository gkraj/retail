package com.retail.superkings.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.superkings.entity.User;
import com.retail.superkings.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User saveProduct(Long userId, List<String> productList) {
		User userDetails = userRepo.findByuserId(userId);
		userDetails.getProductList().clear();
		userDetails.setProductList(productList);
		return userRepo.save(userDetails);
	}

	
}
