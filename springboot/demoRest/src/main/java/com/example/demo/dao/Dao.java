package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> getById(int id);
    List<T> getAll();
//    int save(T t);
//    int update(T t);
//    int delete(T t);

}
