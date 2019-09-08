package com.java.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.java.model.User;


	public interface UserMongoRepository extends MongoRepository<User, integer=''> {
	}

