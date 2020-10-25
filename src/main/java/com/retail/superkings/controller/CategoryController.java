package com.retail.superkings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.retail.superkings.entity.Category;
import com.retail.superkings.entity.Product;
import com.retail.superkings.repo.CategoryRepo;
import com.retail.superkings.repo.ProductRepo;

@RestController
@CrossOrigin
public class CategoryController {
	
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ProductRepo productRepo;
	
	@GetMapping("category")
	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}
	
	@GetMapping("category/product/{name}")
	public List<Product> getProductByName(@PathVariable String name){
		return  productRepo.findBypName(name);
	}

}
