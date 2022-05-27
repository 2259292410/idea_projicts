package com.kuang.test;

import com.kuang.mapper.StudentMapper;
import com.kuang.pojo.Student;
import com.kuang.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Mytest {
    public static void main(String[] args) {
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        session.close();
    }
}
