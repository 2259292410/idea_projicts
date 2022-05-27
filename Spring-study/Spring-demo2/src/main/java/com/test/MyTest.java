package com.test;

import com.pojo.Emp;
import com.service.impl.EmpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmpServiceImpl empService = context.getBean("empService", EmpServiceImpl.class);
        empService.add();
    }
    public static void t2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    public static void main(String[] args) {
//        t1();
        t2();
    }
}
