package SJMS.proxy.proxydemo._proxy;

interface  It1{
    void   m1();
    void  m2(int a);
}

interface  It2{
    Integer m3(int a);
    //  It2 m4(); //又要返回对应的IT2的实例
}

public class  Project1 implements It1,It2 {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2(int a) {
        System.out.println("m2   a:"+a);
    }

    @Override
    public Integer m3(int a) {
        System.out.println("m3   a:"+a);
        int b=10/0;
        return a*a;
    }




}