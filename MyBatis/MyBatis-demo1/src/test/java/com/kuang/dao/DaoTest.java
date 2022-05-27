package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

public class DaoTest {

    //注意导包：org.apache.log4j.Logger
    static Logger logger = Logger.getLogger(DaoTest.class);

    @Test
    public void queryAllTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.queryAll();
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void queryUserById(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.queryUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUserTest(){
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        mapper.addUser(new User(4,"花卉","666"));
        session.commit();
        session.close();
    }

    @Test
    public void updateUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        mapper.updateUser(new User(4,"hh","99"));
        session.commit();
        session.close();
    }

    @Test
    public void deleteUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        mapper.deleteUser(4);
        session.commit();
        session.close();
    }

    @Test
    public void selectUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        mapper.selectUser(map);
        session.close();
    }
    
    @Test
    public void testMap(){
        Map map = new HashMap();
        e zs = new e(1,18888, "张三");
        e ls = new e(2,1888, "李四");
        e ww = new e(3,123123, "王五");
        e zl = new e(4,2888, "赵六");
        map.put(zs.getId(),zs);
        map.put(ls.getId(),ls);
        map.put(ww.getId(),ww);
        map.put(zl.getId(),zl);
        System.out.println("==========map.entrySet()=============");
        Set set = map.entrySet();
        for (Object entry : set) {
            Map.Entry m =(Map.Entry)entry;
            e e = (e)m.getValue();
            if(e.getGz()>18000){
                System.out.println(e);
            }
        }
        System.out.println("------------map.keySet()------------------");
        Set set1 = map.keySet();
        for (Object o : set1) {
           e e =(e)map.get(o);
            if(e.getGz()>18000){
                System.out.println(e);
            }
        }
        System.out.println("-------------map.values()-----------------");
        Collection values = map.values();
        for (Object value : values) {
          e e  =(e)value;
            if(e.getGz()>18000){
                System.out.println(e);
            }

        }


    }
    
}
class e{
    private int id;
    private int gz;
    private String name;

    public e(int id, int gz, String name) {
        this.id = id;
        this.gz = gz;
        this.name = name;
    }

    @Override
    public String toString() {
        return "e{" +
                "id=" + id +
                ", gz=" + gz +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
