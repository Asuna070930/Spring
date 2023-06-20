package com.atguigu.test;

import com.atguigu.dao.Person;
import com.atguigu.dao.impl.Chinese;
import com.atguigu.staticproxy.PersonProxy;

public class Demo01 {
    public static void main(String[] args) {
        Person chinese = (Person) new Chinese();
//        person.eat("饺子");
        //1.创建代理类对象
        PersonProxy personProxy = new PersonProxy(chinese);
        personProxy.eat("面条");
    }
}
