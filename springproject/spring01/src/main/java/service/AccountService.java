package service;

import pojo.Account;

public interface AccountService {


    Account getAccount(Integer id);

    void editAccount(Account account);
}
