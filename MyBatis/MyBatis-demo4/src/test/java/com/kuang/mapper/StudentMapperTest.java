package com.kuang.mapper;

import com.kuang.pojo.Student;
import com.kuang.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void queryAll(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryAll();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void getStudents(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void getStudents2(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
    @Test
    public void getStudentById(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudentById(1);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
}
