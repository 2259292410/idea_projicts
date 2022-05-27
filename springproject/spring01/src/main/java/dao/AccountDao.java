package dao;

import pojo.Account;

public interface AccountDao {

    Account getAccount(Integer id);

    void editAccount(Account account);
}
