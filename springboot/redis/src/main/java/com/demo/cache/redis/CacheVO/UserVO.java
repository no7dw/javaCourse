package com.demo.cache.redis.CacheVO;

import java.io.Serializable;

public class UserVO implements Serializable {
    private String id;
    private String name;

    public UserVO(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
