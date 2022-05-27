package com.dao;

import com.entity.Manager;
import com.entity.User;

public interface ManagerDao {
    /**
     * 根据 用户名和密码查询管理员信息
     * @param manager_name
     * @param password
     * @return 如果返回null,说明用户名或密码错误,反之亦然
     */
    public Manager queryManagerByManagernameAndPassword(String manager_name, String password);

}
