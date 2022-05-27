package com.dao;

public class UserDaoImpl implements UserDao {
    public int add(int a, int b) {
        System.out.println("add方法执行");
        return a+b;
    }

    public String update(String id) {
        System.out.println("update方法执行");
        return id;
    }
}
