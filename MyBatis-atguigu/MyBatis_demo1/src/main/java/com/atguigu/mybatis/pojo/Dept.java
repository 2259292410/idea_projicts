package com.atguigu.mybatis.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Dept {
    private Integer dId;
    private String dName;
    private List<Emp> emps;

}
