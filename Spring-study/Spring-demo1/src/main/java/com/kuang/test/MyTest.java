package com.kuang.test;

import com.kuang.pojo.Hello;
import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        Hello hello = (Hello) context.getBean("hello");
//        hello.show();
        User user = (User)context.getBean("user");
//        System.out.println(user);
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }
    public void test1(){

    }
}
