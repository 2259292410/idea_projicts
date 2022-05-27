package com;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private String name;
    private MyBean myBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", myBean=" + myBean +
                '}';
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Student stu= context.getBean("stu",Student.class);
        System.out.println(stu);

    }
}
