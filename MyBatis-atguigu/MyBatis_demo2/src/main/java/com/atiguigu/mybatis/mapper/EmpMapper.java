package com.atiguigu.mybatis.mapper;

import com.atiguigu.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> selectAllEmp();
}
