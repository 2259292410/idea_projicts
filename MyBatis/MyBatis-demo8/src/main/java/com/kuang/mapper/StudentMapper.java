package com.kuang.mapper;

import com.kuang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    /*
    1：mybatis 创建一个接口
     实现查询学生信息，学生的年级信息
     和该学生的考试程序
      xml 中实现1对多和1对1
    2：改造上述方式
       使用延时加载
    3：使用注解实现
     */
    List<Student> getStudent();
}
