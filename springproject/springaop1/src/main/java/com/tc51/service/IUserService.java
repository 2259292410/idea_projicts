package com.tc51.service;

import com.tc51.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
    User findUserById(Integer id);

}
