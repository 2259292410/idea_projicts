package com.dao;

import com.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 如果返回null,说明没有这个用户。反之亦然
     */
    public User queryUserByUsername(String username);


    /**
     * 根据 用户名和密码查询用户信息
     * @param username
     * @param password
     * @return 如果返回null,说明用户名或密码错误,反之亦然
     */
    public User queryUserByUsernameAndPassword(String username,String password);


    /**
     * 保存用户信息
     * @param user
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int saveUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryUser();

    /**
     * 添加用户
     * @return
     */
    public int addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteUser(Integer id);
}
