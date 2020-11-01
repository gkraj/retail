package com.retail.superkings.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.superkings.bean.ResponseBean;
import com.retail.superkings.entity.User;
import com.retail.superkings.repo.UserRepo;
import com.retail.superkings.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public String newUser(@RequestBody Map<String, String> params) {

		String userId = params.get("userId");
		@SuppressWarnings("unchecked")
		List<String> ul = (List<String>) userRepo.findByuserId(userId);
		if (ul == null) {
			userService.newUser(params);
			return "successfully registred the user, please login to shop";
		}
		else {
			return "userID already exist, please enter new userId";
		}
	}
	
	@PostMapping("/login")
	public ResponseBean loginUser(@RequestBody Map<String, String> params) {
		String userId = params.get("userId");
		User ul = userRepo.findByuserId(userId);
		if(ul != null) {
			if(params.get("password").equals(ul.getUserPw())) {
				return new ResponseBean(null, "Success", ul.getUserName());
			} else {
				return new ResponseBean(null, "Invalid Password", null);
			}	
		} else {
			return new ResponseBean(null, "Invalid userId", null);
		}
	}

}
