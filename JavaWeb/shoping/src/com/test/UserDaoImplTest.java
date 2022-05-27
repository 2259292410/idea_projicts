package com.test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    private UserDao userDao = new UserDaoImpl();


    @Test
    public  void  queryUser(){
        System.out.println(userDao.queryUser());
    }

    @Test
    public void queryUserByUsername() {
        System.out.println(userDao.queryUserByUsername("admin"));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        System.out.println(userDao.queryUserByUsernameAndPassword("admin1", "admin"));
    }

    @Test
    public void saveUser() {
        User user = new User(null,"admin1","admin1","admin1@shoping.com");
        System.out.println(userDao.saveUser(user));
    }
}