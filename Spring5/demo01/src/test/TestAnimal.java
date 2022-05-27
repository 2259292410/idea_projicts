package test;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {
    @Test
    public void testAnimal(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
       Object animal = context.getBean("animal");
    }
}
