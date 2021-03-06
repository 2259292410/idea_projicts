package com.atguigu.crud.service;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAllEmp(){
        return employeeMapper.selectByExampleWithDept(null);
    }
}
