package com.kuang.pojo;

public class User {
    private String username;
    private String password;

//    public User() {
//        System.out.println("User的无参构造方法执行了。。。");
//    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
