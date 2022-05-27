package dao.impl;

import dao.StudentDao;

public class StudentDaoimpl implements StudentDao
{
    @Override
    public void getStudent() {
        System.out.println("select * from Student");
    }
}
