package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao  {
    @Override
    public User queryUserByUsername(String username) {
        String sql ="select `u_id` as id,`username`,`password`,`email` from `user` where `username`=?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql ="select `u_id` as id,`username`,`password`,`email` from `user` where `username`=? and password=?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into `user`(`username`,`password`,`email`) values(?,?,?)";
        return update(sql, user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public List<User> queryUser() {
        String sql="SELECT `u_id` as `id`,`username`,`password`,`email` FROM `user`";
        return queryForList(User.class,sql);
    }

    @Override
    public int addUser(User user) {
        String sql="INSERT INTO `shoping`.`user` ( `username`, `password`, `email`)VALUES( ?, ?, ?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public int deleteUser(Integer id) {
        String sql="delete from `user` where u_id=? ";
        return update(sql,id);
    }
}
