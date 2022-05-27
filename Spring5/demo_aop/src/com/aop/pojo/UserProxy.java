package com.aop.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {
    @Pointcut("execution(* com.aop.pojo.User.add(..))")
    public void pointcut(){

    }

    @Before("execution(* com.aop.pojo.User.add(..))")
    public void before(){
        System.out.println("before...");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");

    }

    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    @After("pointcur()")
    public void after(){
        System.out.println("after");
    }

    /*
    * 前置
    * 环绕
    * 异常
    * 后置通知
    * 最终通知
    * */
}
