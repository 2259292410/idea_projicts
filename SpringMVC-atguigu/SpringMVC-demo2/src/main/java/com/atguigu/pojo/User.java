package com.atguigu.pojo;

import java.util.Arrays;

public class User {
    private String username;
    private String password;
    private String sex;
    private String[] hobby;

    public User(String username, String password, String sex, String[] hobby) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.hobby = hobby;
    }

    public  User(){

    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
