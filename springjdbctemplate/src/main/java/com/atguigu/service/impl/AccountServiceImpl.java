package com.atguigu.service.impl;

import com.atguigu.dao.AccountDao;
import com.atguigu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountservice")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    //@Transactional
    public void zhuanzhang(int inuserid, int outuserid,int money) {
        accountDao.outmoney(outuserid,money);
        System.out.println(5/0);
        accountDao.inmoney(inuserid,money);
    }
}
