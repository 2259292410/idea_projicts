package com.hspedu.homework;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws Exception, InstantiationException {
        Class<File> fileClass = File.class;
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
//        Constructor<File> constructor = fileClass.getConstructor(String.class);
//        File zzq = constructor.newInstance("e:\\bb.txt");
//        Method createNewFile = fileClass.getMethod("createNewFile");
//        Object invoke = createNewFile.invoke(zzq);
//        System.out.println(invoke);


    }
}
