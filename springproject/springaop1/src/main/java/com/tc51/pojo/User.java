package com.tc51.pojo;

public class User {

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public User() {

    }


    private  Integer id;
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
