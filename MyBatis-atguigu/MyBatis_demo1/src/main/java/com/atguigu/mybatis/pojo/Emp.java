package com.atguigu.mybatis.pojo;


import lombok.Data;


public class Emp {
    private Integer eId;
    private String eName;
    private String sex;
    private Integer age;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer eId, String eName, String sex, Integer age, Dept dept) {
        this.eId = eId;
        this.eName = eName;
        this.sex = sex;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}';
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
