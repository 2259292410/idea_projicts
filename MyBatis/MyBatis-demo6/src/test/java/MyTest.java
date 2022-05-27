import com.kuang.mapper.TeacherMapper;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getTeacher(){
        SqlSession session = MyBatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher(2);
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        session.close();
    }


    @Test
    public void getTeacher2(){
        SqlSession session = MyBatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher2(1);
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        session.close();
    }
}
