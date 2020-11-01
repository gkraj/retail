package com.retail.superkings.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.retail.superkings.bean.CartBean;
import com.retail.superkings.entity.Cart;

public interface CartRepo extends MongoRepository<Cart, String> {

	void save(CartBean products);

	Cart findByuserId(String userId);

}
