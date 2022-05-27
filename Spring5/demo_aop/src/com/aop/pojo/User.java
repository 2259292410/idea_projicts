package com.aop.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    public  int add(int a,int b){
        System.out.println("add....");
        return a+b;
    }
}
