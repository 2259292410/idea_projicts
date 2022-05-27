package pojo;

import service.StudentService;

import java.util.*;

public class BeanModel {

    private StudentService studentService;


    private   int a;
    private  String s;
    private Map map;
    public Set set;
    private Properties myProps;
    private List  list ;
    private  String[] strs;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getMyProps() {
        return myProps;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }


    @Override
    public String toString() {
        return "BeanModel{" +
                "studentService=" + studentService +
                ", a=" + a +
                ", s='" + s + '\'' +
                ", map=" + map +
                ", set=" + set +
                ", myProps=" + myProps +
                ", list=" + list +
                ", strs=" + Arrays.toString(strs) +
                '}';
    }
}
