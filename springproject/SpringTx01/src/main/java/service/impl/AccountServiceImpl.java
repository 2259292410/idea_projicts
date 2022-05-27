package service.impl;

import dao.AccountDao;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import pojo.Account;
import service.AccountService;
import untils.TXManager;

public class AccountServiceImpl implements AccountService {

     private AccountDao accountDao;
     private TXManager tx;


    public void setTx(TXManager tx) {
        this.tx = tx;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(int fid, int tid, int money) {
  // 这样写没问题  这样写有没有什么缺陷

   try {
       tx.begin();
       Account account1 = accountDao.getAccount(fid);
       Account account2 = accountDao.getAccount(tid);

       account1.setMoney(account1.getMoney()-money);
       account2.setMoney(account2.getMoney()+money);

       accountDao.edit(account1);
      int a=1/0;
       accountDao.edit(account2);
       tx.commit();
   }
   catch (Exception ex){
       System.out.println("回滚");
       tx.rollback();
   }





    }
}
