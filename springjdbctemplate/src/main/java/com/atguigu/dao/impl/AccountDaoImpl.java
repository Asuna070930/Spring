package com.atguigu.dao.impl;

import com.atguigu.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void inmoney(int userId, int money) {
        String sql = "update account set balance=balance+? where id=?";
        jdbcTemplate.update(sql, money, userId);
    }

    @Override
    public void outmoney(int userId, int money) {
        String sql = "update account set balance=balance-? where id=?";
        jdbcTemplate.update(sql, money, userId);
    }
}
