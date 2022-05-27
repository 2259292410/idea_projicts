package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
        User user01 = context.getBean("user01", User.class);
        User user02 = context.getBean("user01", User.class);
        System.out.println("context:"+(user01==user02));
        MyConfig myConfig = context.getBean(MyConfig.class);
        System.out.println("myConfig:"+(myConfig.user01()==myConfig.user01()));
        Pet tom = context.getBean("tom", Pet.class);
        System.out.println(tom);
        System.out.println("ssss:"+(user01.getPet()==tom));
    }
}
