package com.kuang.mapper;

import com.kuang.pojo.Teacher;

public interface TeacherMapper {
    //获取指定老师，及老师下的所有学生
    public Teacher getTeacher(int id);
}
