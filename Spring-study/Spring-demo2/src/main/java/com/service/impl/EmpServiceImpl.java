package com.service.impl;

import com.dao.EmpDao;
import com.service.EmpService;

public class EmpServiceImpl implements EmpService {
    private EmpDao empDao;

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    public int add() {
        System.out.println("EmpServiceImpl add()方法执行");
        empDao.addEmp();
        return 0;
    }
}
