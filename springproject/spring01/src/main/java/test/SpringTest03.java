package test;

import config.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;
import service.AccountService;

public class SpringTest03 {

    @Test
    public void t1(){
        ApplicationContext ac=
                new AnnotationConfigApplicationContext(SpringBean.class);
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        Account account = accountService.getAccount(1);
        System.out.println(account);


    }


}
