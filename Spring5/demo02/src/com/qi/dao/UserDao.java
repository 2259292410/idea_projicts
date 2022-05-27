package com.qi.dao;

import org.springframework.stereotype.Component;

@Component(value = "userDao1")
public class UserDao {
    public void add(){
        System.out.println("userdao add.....");
    }
}
