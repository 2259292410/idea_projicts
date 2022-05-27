package kuang.dao;

import kuang.pojo.Student;
import kuang.pojo.Teacher;

import java.util.List;

public interface StudentMapper {
    //获取所有学生及对应老师的信息
    public List<Student> getStudents();
    public Teacher getTeacher(Integer id);
    public List<Student> getStudents2();
    public List<Student> queryAll();
}
