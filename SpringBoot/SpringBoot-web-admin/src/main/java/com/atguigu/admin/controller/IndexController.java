package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping(value ={"/","/login"})
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){

        if ("admin".equals(user.getPassword())){
            session.setAttribute("user",user);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }

    @RequestMapping("/main.html")
    public String mainPage(HttpSession session){
//        if (session.getAttribute("user")!=null){
//            return "main";
//        }else {
//            return "login";
//        }
        return "main";

    }

}
