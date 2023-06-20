package com.atguigu.dao;

public interface AccountDao {
    //转出金额
    public void inmoney(int userId, int money);

    //转入金额
    public void outmoney(int userId, int money);
}
