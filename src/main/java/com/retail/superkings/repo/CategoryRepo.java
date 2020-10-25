package com.retail.superkings.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.retail.superkings.entity.Category;


public interface CategoryRepo extends MongoRepository<Category, String> {

}
