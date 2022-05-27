package com.kuang.mapper;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取指定老师，及老师下的所有学生
    public List<Teacher> getTeacher(int id);
    public List<Teacher> getTeacher2( int id);
}
