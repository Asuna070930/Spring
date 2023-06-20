package com.atguigu.aop.dao.impl;

import com.atguigu.aop.dao.CalculatorDao;
import org.springframework.stereotype.Repository;

@Repository("cadao")
public class CalculatorDaoImpl implements CalculatorDao {
    @Override
    public void add(int a ,int b) {
        System.out.println("加法方法被调用");
    }

    @Override
    public int div(int a, int b) {
        System.out.println("除法被调用");
//        System.out.println(5/0);
        return a/b;
    }
}
