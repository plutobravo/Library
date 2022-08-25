package com.library.library.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.library.library.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
