package com.kuang.mapper;

import org.junit.Test;

public class NumberTest {
    @Test
    public void test1(){
        int a=50;
        Integer a1 =50;
        Integer b1=50;
        Integer c1=100;
        Integer d1=a1+b1;
        System.out.println(a == a1);//t
        System.out.println(a==b1);//t
        System.out.println(a1==b1);//t
        System.out.println(c1==(a1+b1));//t
        System.out.println(c1==d1);//t
    }

    @Test
    public void test2(){
        int a=100;
        Integer a1 =100;
        Integer b1=100;
        Integer c1=200;
        Integer d1=a1+b1;
        System.out.println(a == a1);//t
        System.out.println(a==b1);//t
        System.out.println(a1==b1);//t
        System.out.println(c1==(a1+b1));//t
        System.out.println(c1==d1);//f
    }
    @Test
    public void test3(){
        int a=200;
        Integer a1 =200;
        Integer b1=200;
        Integer c1=400;
        Integer d1=a1+b1;
        System.out.println(a == a1);//t
        System.out.println(a==b1);//t
        System.out.println(a1==b1);//f
        System.out.println(c1==(a1+b1));//t
        System.out.println(c1==d1);//f
    }

    @Test
    public void test4(){
        double a=50d;
        Double a1 =50d;
        Double b1=50d;
        Double c1=100d;
        Double d1=a1+b1;
        System.out.println(a == a1);//t
        System.out.println(a==b1);//t
        System.out.println(a1==b1);//f
        System.out.println(c1==(a1+b1));//t
        System.out.println(c1==d1);//f
    }
}
