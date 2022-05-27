package com.zzq.test;

import com.zzq.bean.Account;
import com.zzq.dao.impl.AccountDaoImpl;
import com.zzq.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void getAccount(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        Account account = accountService.getAccount(1);
        System.out.println(account);
    }
}
