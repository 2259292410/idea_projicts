package com.hspedu;

public class Cat {
    private   String name;
    private int age;
    private  Double money;

    public Cat(String name, int age, Double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public  Cat(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    public void hi(){
        System.out.println("hi()...调用");
    }
}
