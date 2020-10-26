package com.retail.superkings.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.retail.superkings.entity.Category;


public interface CategoryRepo extends MongoRepository<Category, String> {

	List<String> findBycName(String categoryName);

}
