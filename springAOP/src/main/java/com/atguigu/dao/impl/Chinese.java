package com.atguigu.dao.impl;

import com.atguigu.dao.Person;

public class Chinese implements Person{
    @Override
    public void eat(String food) {
        System.out.println("中国人用筷子吃"+food);
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }


}
