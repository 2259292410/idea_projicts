package kuang.test;

import kuang.dao.StudentMapper;
import kuang.pojo.Student;
import kuang.pojo.Teacher;
import kuang.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void  getStudent(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void getTeacher(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        session.close();
    }

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

}
