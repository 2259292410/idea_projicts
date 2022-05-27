package com.hspedu.reflection.question;

import com.hspedu.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream inputStream = ReflectionQuestion.class.getClassLoader().getResourceAsStream("re.properties");
        properties.load(inputStream);
        String classfullpath = properties.get("classfullpath").toString();
        System.out.println(classfullpath);

        String method1 = properties.get("method").toString();
        System.out.println(method1);
        //加载类, 返回 Class 类型的对象 catClass
        Class<?> catClass = Class.forName(classfullpath);
        System.out.println(catClass);
        //创建Cat对象
        Cat o = (Cat) catClass.newInstance();
        //创建Cat类中hi()方法的对象
        Method method = catClass.getMethod(method1);
        //调用hi()方法
        method.invoke(o);

        System.out.println(o);
    }

}
