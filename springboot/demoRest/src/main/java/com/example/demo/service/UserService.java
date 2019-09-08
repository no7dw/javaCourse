package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.dao.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService implements Dao<User> {
    List<User> userList = new ArrayList<User>();
    public UserService(){
        userList.add( new User(1, "wade"));
        userList.add( new User(2, "deng"));
    }

    @Override
    public Optional<User> getById(int id) {
        return Optional.ofNullable( userList.get(id));
    }

    @Override
    public List<User> getAll() {
        return this.userList;
    }
}
