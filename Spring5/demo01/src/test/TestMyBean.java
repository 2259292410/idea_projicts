package test;

import com.MyBean;
import com.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {
    @Test
    public void testMyBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
//        Student student= (Student)context.getBean("myBean");
//        Student student2= (Student)context.getBean("myBean");
//
//        System.out.println(student);
//        System.out.println(student2);

        MyBean myBean= (MyBean)context.getBean("myBean");
        MyBean myBean2= (MyBean)context.getBean("myBean");

        System.out.println(myBean);
        System.out.println(myBean2);

    }
}
