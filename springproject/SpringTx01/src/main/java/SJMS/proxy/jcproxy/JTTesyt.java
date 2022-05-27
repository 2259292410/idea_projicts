package SJMS.proxy.jcproxy;

public class JTTesyt {
    public static void main(String[] args) {

        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.select();
        System.out.println("----------------------");
        userServiceProxy.update(1000000);

    }
}
