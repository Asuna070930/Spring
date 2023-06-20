package com.atguigu.staticproxy;

import com.atguigu.dao.Person;

import java.awt.print.Pageable;

//代理类
public class PersonProxy implements Person {
    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat(String food) {
        System.out.println("开始吃饭");
        person.eat(food);
        System.out.println("结束吃饭");
    }

    @Override
    public void sleep() {

    }


}
