package SJMS.proxy.jcproxy;

public class UserServiceImpl  implements  UserService{
    @Override
    public void select() {
        System.out.println("查询操作");
    }

    @Override
    public void update(double i) {
        //  代理对象要抽10%的点
        //  100W  10  ->90w

        System.out.println("更新操作： 当前值"+ i);

    }
}
