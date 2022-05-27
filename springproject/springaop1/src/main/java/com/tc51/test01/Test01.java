package com.tc51.test01;

import com.tc51.pojo.User;
import com.tc51.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {

    @Test
    public void a(){

        ApplicationContext ac=new  ClassPathXmlApplicationContext("Bean.xml");
        IUserService userService = ac.getBean("userService", IUserService.class);

        List<User> all = userService.findAll();
        System.out.println(all.get(0).getName());
        System.out.println("--------");
        List<User> all1 = userService.findAll();

        System.out.println(all1.get(0).getName());
    }
}
