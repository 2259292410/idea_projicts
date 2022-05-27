package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAllEmp();
    Emp getEmpById(@Param("eid") Integer id);
    List<Emp> getEmpListByDid(@Param("did") int did);
    List<Emp> getEmpListByMoreTJ(Emp emp);
    int insertMoreEmp(@Param("emps") List<Emp> emps);
    int deleteMoreByArray(@Param("eids") int[] eids);

}
