package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    Dept getDeptById(@Param("did") Integer id);

    List<Dept> getDeptEmpByDid(@Param("did") Integer id);

    Dept getDeptByStep(@Param("did") int did);

}
