package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String testHello(){
        return "hello,Spring boot2";
    }

    @GetMapping("/person")
    public Person testPerson(){
        return person;
    }

}
