package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DeptTest {
    @Test
    public  void testGetDeptEmpByDid(){
        SqlSession session = SqlSessionUtil.getSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> deptEmpByDid = mapper.getDeptEmpByDid(1);
        for (Dept dept : deptEmpByDid) {
            System.out.println(dept);
        }
        session.close();
    }

    @Test
    public void testGetDeptByStep(){
        SqlSession session = SqlSessionUtil.getSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept deptByStep = mapper.getDeptByStep(1);
        System.out.println(deptByStep);
        session.close();
    }

}
