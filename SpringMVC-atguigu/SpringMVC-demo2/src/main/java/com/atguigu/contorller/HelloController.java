package com.atguigu.contorller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping(value = {"/test","testRequestMapping"},
                    method = RequestMethod.GET
    )
    public String testRequestMapping(){
        return "success";
    }

    @RequestMapping("/test2/{id}")
    public String test2(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/test3")
    public String test3(String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/test4")
    public String test4(User user,@RequestParam(value = "username",defaultValue = "admin")String  username){
        System.out.println(user);
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope","hello,ModelAndView");
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","hello,Model");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope","hello,application");
        return "success";
    }
}
