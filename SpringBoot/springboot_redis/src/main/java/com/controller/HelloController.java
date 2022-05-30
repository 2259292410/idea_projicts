package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String testHello(){
        return "hello";
    }
    @GetMapping("/testRedis")
    public String testRedis(){
        redisTemplate.opsForValue().set("k1","v1");
        String k1 = (String)redisTemplate.opsForValue().get("k1");
        return k1;
    }

}
