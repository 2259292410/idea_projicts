package com.zzq.controller;

import com.zzq.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping("/testJson")
    public Student testStudentJson(){
        return new Student("张三",18);
    }

    @GetMapping("/testError")
    public String testError(){
        int a=10/0;
        return "success";
    }
}
