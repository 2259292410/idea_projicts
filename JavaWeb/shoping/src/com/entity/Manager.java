package com.entity;

public class Manager {
    private Integer id;
    private  String manager_name;
    private  String password;

    public Manager() {
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", manager_name='" + manager_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Manager(Integer id, String manager_name, String password) {
        this.id = id;
        this.manager_name = manager_name;
        this.password = password;
    }
}
