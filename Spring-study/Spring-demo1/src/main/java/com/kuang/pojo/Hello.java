package com.kuang.pojo;

public class Hello {
    private String name;

    public Hello() {
        System.out.println("Hello的无参构造方法执行了。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello的show()方法。。。");
        System.out.println("name="+name);
    }
}
