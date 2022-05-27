package com.atguigu.mybatis.test;

import com.atiguigu.mybatis.mapper.EmpMapper;
import com.atiguigu.mybatis.pojo.Emp;
import com.atiguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmpTest {
    @Test
    public void test1(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectAllEmp();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
        session.close();

    }
}
