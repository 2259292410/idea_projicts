package com.tc51.service;

import com.tc51.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {

    @Override
    public List<User> findAll() {
        System.out.println(" 从mysql中获取数据..........");
        List<User> users=new ArrayList<>();
        users.add(new User(1,"zhangsan"));
        return users ;
    }

    @Override
    public User findUserById(Integer id) {
        System.out.println("findUserById..........");
        return null;
    }
}
