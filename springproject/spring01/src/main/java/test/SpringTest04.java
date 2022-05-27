package test;

import config.SpringBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Account;
import service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringBean.class)
public class SpringTest04 {

    @Autowired
    private AccountService accountService;


    @Test
    public void aa(){
        Account account = accountService.getAccount(1);
        System.out.println(account);
    }




}
