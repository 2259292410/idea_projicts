package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;
import pojo.BeanModel;
import service.AccountService;
import service.StudentService;

public class SpringTest01 {

    @Test
    public void t1(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("bean.xml");
        StudentService studentService = ac.getBean("studentService", StudentService.class);
        studentService.getStudent();



        BeanModel beanModel = ac.getBean("beanModel", BeanModel.class);
        System.out.println(beanModel);




    }
    @Test
    public void t2(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("bean.xml");
        AccountService acBean = ac.getBean("accountService", AccountService.class);
        Account account = acBean.getAccount(2);
        System.out.println(account);





    }

}
