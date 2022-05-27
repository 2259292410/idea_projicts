package service.impl;

import dao.StudentDao;
import dao.impl.StudentDaoimpl;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentServiceImpl(){
        System.out.println("无参的构造方法");
    }

    public StudentServiceImpl(int a, String b){
        System.out.println("有参的构造方法：a:" + a +" b:"+b);
    }


    @Override
    public void getStudent() {
        //System.out.println("StudentServiceImpl");
        studentDao.getStudent();
    }
}
