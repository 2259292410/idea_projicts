package com.qi.dao;

public class OrderDaoImpl implements OrderDao {

    public String update(String id){
        System.out.println("update..执行");
        return id;
    }

    public int addNumber(int a,int b){
        System.out.println("addNumber....执行");
        return a+b;
    }
}
