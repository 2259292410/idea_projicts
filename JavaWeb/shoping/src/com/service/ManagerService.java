package com.service;

import com.entity.Manager;
import com.entity.User;

public interface ManagerService {
    /**
     * 登录
     * @param manager
     * @return 如果返回null，说明登录失败，返回有值，是登录成功
     */
    public Manager login(Manager manager);
}
