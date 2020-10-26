package com.retail.superkings.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.retail.superkings.entity.User;

public interface UserRepo extends MongoRepository<User, Long> {

	User findByuserId(Long userId);

}
