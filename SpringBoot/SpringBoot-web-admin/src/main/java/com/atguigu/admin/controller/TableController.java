package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class TableController {
    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table(){
        return "/table/basic_table";
    }

    @GetMapping("dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn ,Model model){
        Page<User> userPage = new Page<>(pn, 2);
        Page<User> page = userService.page(userPage, null);

        model.addAttribute("users",page);
        return "/table/dynamic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id")Integer id, @RequestParam("pn")Integer pn, RedirectAttributes ra){
        userService.removeById(id);
        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";

    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "/table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "/table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "/table/responsive_table";
    }
}
