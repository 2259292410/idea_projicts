package com.dao.impl;

import com.dao.ManagerDao;
import com.entity.Manager;
import com.entity.User;

public class ManagerDaoImpl extends BaseDao implements ManagerDao {
    @Override
    public Manager queryManagerByManagernameAndPassword(String manager_name, String password) {
        String sql ="SELECT `id`,`manager_name`,`password` FROM manager \n" +
                "WHERE manager_name=? AND `password`=?";
        return queryForOne(Manager.class,sql,manager_name,password);
    }
}
