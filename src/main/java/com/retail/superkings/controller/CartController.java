package com.retail.superkings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.superkings.entity.Cart;
import com.retail.superkings.repo.CartRepo;
import com.retail.superkings.service.CartService;

@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	@Autowired
	private CartRepo cartRepo;
	
	
	@GetMapping("/{userId}")
	public @ResponseBody Object getCartByUserId(@PathVariable String userId) {
		return cartService.getCartById(userId);
	}
	
	@PostMapping("/add")
	public @ResponseBody Object addProducttoCart(@RequestBody Cart products) {
		return cartService.saveProduct(products);
	}
}
