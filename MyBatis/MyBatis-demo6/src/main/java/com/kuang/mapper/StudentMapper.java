package com.kuang.mapper;

import com.kuang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> queryAll();
    List<Student> getStudents();
    List<Student>  getStudents2();
}
