package com.atguigu.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.admin.mapper")
@SpringBootApplication
public class SpringBootWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebAdminApplication.class, args);
    }
        
}
