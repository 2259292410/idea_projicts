package com.test;

import com.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void t1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.transfer();
    }

}
