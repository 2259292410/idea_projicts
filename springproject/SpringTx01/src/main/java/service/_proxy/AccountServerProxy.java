package service._proxy;

import service.AccountService;
import untils.TXManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AccountServerProxy {
    private AccountService accountService;
    // 添加事务管理器
    private TXManager txManager;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setTxManager(TXManager txManager) {
        this.txManager = txManager;
    }
    private  void begin(){
        ///
    }
    private  void after(){

    }



    public AccountService getObject(){

        ClassLoader loader=AccountServerProxy.class.getClassLoader();
        Class<?>[] interfaces=accountService.getClass().getInterfaces();
        InvocationHandler h=new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke =null;
                try {
                    begin();
                    System.out.println("动态代理中的方法");
                    txManager.begin();
                     invoke = method.invoke(accountService, args);
                    txManager.commit();
                    after();
                }
                catch ( Exception exception)
                {
                    System.out.println("已回滚");

                    txManager.rollback();
                }
                finally {
                    System.out.println("已关闭");
                    txManager.close();
                }

                return invoke;
            }
        };

        Object o = Proxy.newProxyInstance(loader, interfaces, h);
        return   (AccountService)o;

    }


}
