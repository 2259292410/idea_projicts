package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;
import pojo.BeanModel;
import service.AccountService;
import service.StudentService;

public class SpringTest02 {

    @Test
    public void t1(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("bean2.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        Account account = accountService.getAccount(1);
        System.out.println(account);


    }


}
