package SJMS.proxy.jcproxy;

public class UserServiceProxy implements  UserService {

    // 这个代理对象代理谁了？
    /*
    * 1： 知道目标对象
    * 2：不知道目标对象
    *   静态代理和装饰者在结构非常相似
    * 代理 解决的是在在正确原有目标对象的方法  或削弱
    *
    *   动态代理
    *       我们不能访问目标对象
    *     但是我们又要通过代理对象去访问被代理对象的方法
    *    请问： 有几种途径
    *        1： 通过接口
    *            接口定义了组规范
    * 代理对象  和  被代理对象 是同一个接口 的所有方法
    *       2： 除了接口还有什么办法
    *           继承
    *    代理对象去继承被代理对象对象
    *
    * java 分别对这两种途径提供了对应解决方案
    *    jdk 官方的方案
    *
    *
    *
    *
     *  也是动态代理的两种方法
    *
    *
    * */
    private  UserService userService;
    public UserServiceProxy(){
        userService =new UserServiceImpl();
    }


    @Override
    public void select() {
        // 代理方法
        // 被代理对象的执行前 或 执行后 额外提供新的功能
        begin();
        userService.select();
        after();
    }

    @Override
    public void update(double money) {
        double  m=money*0.9;
        //  公关啊 .....
        userService.update(m);
        after();
    }

    private  void begin(){
        System.out.println("开始执行前");
    }
    private  void after(){
        System.out.println("服务反馈");
    }
}
