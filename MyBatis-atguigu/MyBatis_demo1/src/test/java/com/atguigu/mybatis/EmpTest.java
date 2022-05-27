package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpTest {
    @Test
    public void testGetAllEmp(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        for (Emp emp : allEmp) {
            System.out.println(emp);
        }
        session.close();
    }

    @Test
    public void testGetEmpById(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp.geteId());
        session.close();
    }

    @Test
    public void  testGetEmpListByMoreTJ(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> empListByMoreTJ = mapper.getEmpListByMoreTJ(new Emp(null,"","",18,null));
        for (Emp emp : empListByMoreTJ) {
            System.out.println(emp);
        }
    }


    @Test
    public void testInsertMoreEmp(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp1 = new Emp(null, "a", "a", 1, null);
        Emp emp2 = new Emp(null, "b", "b", 1, null);
        Emp emp3 = new Emp(null, "c", "c", 1, null);
        Emp emp4 = new Emp(null, "c", "d", 1, null);
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);

        System.out.println(mapper.insertMoreEmp(emps));
        session.commit();
        session.close();
    }


    @Test
    public void testDeleteMoreByArray(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        int[] arr ={6,7,8,9};
        mapper.deleteMoreByArray(arr);
        session.commit();
        session.close();
    }

    @Test
    public  void test2(){
        com.atguigu.mybatis.test.b b = new test.b();
        com.atguigu.mybatis.test.a a = new test().new a();
    }

}
