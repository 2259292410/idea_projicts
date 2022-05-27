package SJMS.proxy.proxydemo._proxy;

import javax.lang.model.element.VariableElement;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {

        /*Proxy

        * */
        Project1 project1 = new Project1();
        // 类加载器：可以指定任务加载器
        ClassLoader loader=Demo.class.getClassLoader();
        Class<?>[] interfaces=Project1.class.getInterfaces();
        // 创建一个对象->只能通过接口的访问->只访问对象接口
        //  object为一个代理对象->只实现了某些接口
        //  只实现了interfaces 中接口
        //   要调用Object 中的方法只能访问interfaces的方法
        /*
        * Project1 为我们实例  有接口中的方法
        * 也有实例Project1的中方法
        * 强转也只能转对应的interfaces的实例
        * 如果 转成Project1的实例，由于Project1有非接口中的方法
        *  会出现转换失败
        * */

        Object object= Proxy.newProxyInstance(
                loader,
                interfaces,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


                        System.out.println("方法调用执行其他的方法");
                        Object invoke=null;
                        try {
                             invoke = method.invoke(project1, args);
                        }
                        catch (Exception  exception){
                            System.out.println("errr 的时候调用其他方法");
                            return  null;

                        }


                        System.out.println("执行后执行的方法");
                       return invoke;

                      }
                   }


                );


        It1 aaa=  (It1)object;
        aaa.m1();
        System.out.println("--------------");
        aaa.m2(200);
        System.out.println("--------------");
        It2 bbb=  (It2)object;

        Integer i = bbb.m3(100);


    }
}
/*
* 应用：
* 1：定义了一个男服务生类
*    有一个结账的方法
*    属于以一句话 ：已结账
* 2：在是有的服务生在结账都时候
*    在结账前输出 欢迎光临
*    在结账完后输出  谢谢惠顾
*
*
*  javaweb 如何解决整站的url请求参数中文乱码
*   解决 get请求的乱码
*  ->创建过滤器中创建httprequest 的代理对象
*  request 方法有很多
*  我们会处理请求参数的实现
*  其他的方法不管
*
*
*
*
* */





