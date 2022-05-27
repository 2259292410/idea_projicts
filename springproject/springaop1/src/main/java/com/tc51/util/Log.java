package com.tc51.util;

import com.mchange.lang.ShortUtils;
import com.tc51.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.List;

public class Log {
    
    public void begin(){
        System.out.println("begin......");
    }

    public void after(){
        System.out.println("after......");
    }


    public void error1(){
        System.out.println("error1......");
    }

    public void over(){
        System.out.println("over......");
    }

//    环绕能够调用被代理对象的信息 》参数 方法执行 回复值
    // 参数 切入点
    public   List<User> around(ProceedingJoinPoint joinPoint){
        // 要执行
        // 方法有参数，获取参数
        // log  log管理

        Object[] args = joinPoint.getArgs();
        try {

            if(RedisUser.getUserList().size()==0){
                List<User> proceed =( List<User>)joinPoint.proceed(args);
                for (User user:proceed ) {
                    RedisUser.setData(user);
                }
                return  proceed;

            }

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("从缓存中获取");
         return  RedisUser.getUserList();
    }




}
