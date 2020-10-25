package com.retail.superkings.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.retail.superkings.entity.Product;

public interface ProductRepo extends MongoRepository<Product, String> {

	 List<Product> findBypName(String name);

}
