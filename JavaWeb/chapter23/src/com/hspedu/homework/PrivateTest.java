package com.hspedu.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateTest {
    private  String name="hellokitty";
    public  String getName(){
        return name;
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        Class<?> pCls = Class.forName("com.hspedu.homework.PrivateTest");
        Object o = pCls.newInstance();
        Field name = pCls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"大花猫");
        Method getName = pCls.getMethod("getName");
         System.out.println(getName.invoke(o));

    }
}
