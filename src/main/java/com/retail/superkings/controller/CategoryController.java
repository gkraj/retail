package com.retail.superkings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.retail.superkings.entity.Category;
import com.retail.superkings.entity.Product;
import com.retail.superkings.entity.User;
import com.retail.superkings.repo.CategoryRepo;
import com.retail.superkings.repo.ProductRepo;
import com.retail.superkings.service.UserService;

@RestController
@CrossOrigin
//@RequestMapping("/api")
public class CategoryController {

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	UserService userService;

	@GetMapping("category")
	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}
	
	@GetMapping("product")
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@GetMapping(value = "category/product/{name}")
	public List<Product> getProductByName(@PathVariable String name) {
		return productRepo.findBypName(name);
	}

	@GetMapping("category/{categoryName}")
	public List<String> getProductList(@PathVariable String categoryName) {
		return categoryRepo.findBycName(categoryName);
	}
	
	@PostMapping("user/{userId}/add/{productName}")
	public User addProducttoCart(@PathVariable Long userId, @PathVariable String productName) {
		return userService.saveProduct(userId, productName);
	}
	
	@PostMapping("user/{userId}/remove/{productName}")
	public User removeProducttoCart(@PathVariable Long userId, @PathVariable String productName) {
		return userService.removeProduct(userId, productName);
	}

}
