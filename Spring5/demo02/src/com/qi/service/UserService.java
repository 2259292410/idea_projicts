package com.qi.service;

import com.qi.dao.OrderDao;
import com.qi.dao.OrderDaoImpl;
import com.qi.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@Component
public class UserService {

//    @Autowired
//    @Qualifier(value = "userDao1")

    @Resource(name = "userDao1")
    UserDao userDao;

    @Value("aaa")
    private String name;


    public void add(){
        System.out.println("service add.....");
        userDao.add();
        System.out.println(name);
    }



    @Test
    public void test1(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        UserDao userDao= (UserDao) context.getBean("userDao");
        userDao.add();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService= (UserService) context.getBean("userService");
        userService.add();
    }



}

class JDKProxy{
    public static void main(String[] args) {
        Class[] interfaces = {OrderDao.class};
        OrderDaoProxy orderDaoProxy = new OrderDaoProxy(new OrderDaoImpl());
     OrderDao orderDao=(OrderDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,orderDaoProxy);
//        int i = orderDao.addNumber(1, 2);
//        System.out.println(i);

        String update = orderDao.update("好的呢");
        System.out.println(update);


    }
}

class  OrderDaoProxy implements InvocationHandler{
    //1 把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    private Object obj;
    public OrderDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            //方法之前
            System.out.println("方法之前执行...."+method.getName()+" :传递的参数..."+ Arrays.toString(args));
            //被增强的方法执行
            Object res = method.invoke(obj, args);
            //方法之后
            System.out.println("方法之后执行...."+obj);

        return res;
    }
}
