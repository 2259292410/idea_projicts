package dao.impl;

import dao.AccountDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import pojo.Account;
import untils.ConnectionUtil;

import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
     /*
     * c3po
     *  java web 如何使用事物的
     *   在当前线程上绑定一个connection
     *   在dao 层中使用这个工具类
     *    事物：单独定义个事务的工具类
     *       关闭自动提交了 ，手动添加 commint  rollback
     *        close 等方法
     *    在逻辑层通过 try  catch  去捕获异常
     *     以达到回滚的结果
     *     为什么是在service 中了？
     *     只有service 才是定义一个逻辑单元
     *
     *   这样写的到来的问题
     *      所有的service都必须手动的添加try catch
     *
     *    没有什么办法，能够像我们正常的编码一样，能让
     *  程序自动进行事务处理。以达到提交 或回滚的结果了？
     *
     *   对象的应该如何扩展
     *    代理
     *    装饰者模式
     *
     *
     * */
     private QueryRunner queryRunner;
     private ConnectionUtil connectionUtil;

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Account getAccount(Integer id) {
        Account query=null;
        try {
             query = (Account)queryRunner.query(
                     connectionUtil.getConnection(),
                     "select * from account where id=?",
                    new BeanHandler(Account.class),
                    id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return query;
    }

    @Override
    public void edit(Account account) {
        try {
            queryRunner.update(
                    connectionUtil.getConnection(),
                    "update account set money=? where id=?",
                    account.getMoney(),
                    account.getId()
                    );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
