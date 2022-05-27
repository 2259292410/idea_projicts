package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void getAllUserTest() {
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        for (User user : list) {
            System.out.println(user);
        }
        session.close();
    }


    @Test
    public void testGetAllUserToMap() {
        SqlSession session = SqlSessionUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println(mapper.getAllUSerToMap());
        session.close();
    }

    @Test
    public  void test1(int a){
        char c ='好';
        System.out.println(c);
    }

    @Test
    public  void test2(){
        test test = new test();
        b b = new b();
        a a = new a();
        a.t();
    }

    class  a{
        public void t(){
            test1(1);
        }

    }
    static class b{
        public void t2(){
        }
    }
}
