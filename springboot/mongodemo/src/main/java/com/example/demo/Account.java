package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "accounts")
public class Account  {
    @Id
    private ObjectId _id;
    private String name;
    private Integer balance;
}