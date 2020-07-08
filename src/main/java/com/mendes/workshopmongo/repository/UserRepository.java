package com.mendes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mendes.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
