package service.impl;

import dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pojo.Account;
import service.AccountService;

import javax.annotation.Resource;

/*
* @Component          通用
* @Service            逻辑
* @Repository         数据层
* @Controller        用在web
* 都是吧类加入到容器中
*  可以指定容器中的名称 没有指定类的名称首字母小写
* */
@Service("accountService")
@Scope("prototype")  //多例
public class AccountServiceImpl implements AccountService {

/*
* 注解开发 可以不使用set 方法
* Autowired 按数据类型去容器中查找
*  如果容器中有多个项目类型的示例
*  1：先按类型
*  2：在按名称
*
*
* */
    //@Autowired
    //@Qualifier("accountDaoImpl2")
    @Resource(name="accountDaoImpl2")
    private AccountDao accountDao;


    @Override
    public Account getAccount(Integer id) {
        return accountDao.getAccount(id);
    }

    @Override
    public void editAccount(Account account) {

    }
}
