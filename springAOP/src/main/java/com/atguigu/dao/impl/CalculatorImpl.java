package com.atguigu.dao.impl;

import com.atguigu.dao.Calculator;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int rs = a+b;
        return rs;
    }

    @Override
    public int sub(int a, int b) {
        int rs = a-b;
        return rs;
    }

    @Override
    public int mul(int a, int b) {
        int rs = a*b;
        return rs;
    }

    @Override
    public int div(int a, int b) {
        int rs = a/b;
        return rs;
    }
}
