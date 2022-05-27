package com.pojo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


public class Account {
    private Integer id;
    private String name;
    private BigDecimal money;

    public Account() {
    }

    public Account(Integer id, String name, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
