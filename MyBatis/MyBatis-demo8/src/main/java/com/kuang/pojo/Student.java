package com.kuang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private Integer studentNo;
    private String loginPwd;
    private String sex;
    private Integer gradeID;
    private String phone;
    private String address;
    private Date bornDate;
    private String identityCard;
    private Grade grade;
}
