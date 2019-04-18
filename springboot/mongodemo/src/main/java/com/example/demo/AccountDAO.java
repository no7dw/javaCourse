package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;
public interface AccountDAO extends MongoRepository<Account, ObjectId> {
    Account findByName(String name);

}