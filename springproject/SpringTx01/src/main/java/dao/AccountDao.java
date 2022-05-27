package dao;

import pojo.Account;

public interface AccountDao {

    // dao  不应该包含业务逻辑
    //  3层中讲过  一个层不应该出现另外一个层的概念
    //  不能跨层调用
    Account getAccount(Integer id);
    void edit(Account account);
}
