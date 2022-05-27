package com.service.impl;

import com.dao.ManagerDao;
import com.dao.impl.ManagerDaoImpl;
import com.entity.Manager;
import com.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
   private ManagerDao managerDao = new ManagerDaoImpl();

    @Override
    public Manager login(Manager manager) {
        return managerDao.queryManagerByManagernameAndPassword(manager.getManager_name(),manager.getPassword());
    }
}
