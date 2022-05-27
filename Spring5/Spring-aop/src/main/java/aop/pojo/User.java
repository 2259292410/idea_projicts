package aop.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    public  Integer add(int a,int b){
        System.out.println("add....");
        return a+b;
    }
}
