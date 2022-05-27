package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     * @return 如果返回null，说明登录失败，返回有值，是登录成功
     */
    public User login(User user);

    /**
     * 检查 用户名是否可用
     * @param username
     * @return 返回true表示用户名已存在，返回false表示用户名可用
     */
    public boolean existsUsername(String username);

    /**
     * 查询用户id
     * @param username
     * @return
     */
    public int queryByUserId(String username);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryUser();

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    public  int deleteUser(Integer id);
}
