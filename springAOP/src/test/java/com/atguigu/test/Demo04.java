package com.atguigu.test;

import com.atguigu.dao.Calculator;
import com.atguigu.dao.Person;
import com.atguigu.dao.impl.CalculatorImpl;
import com.atguigu.dao.impl.Chinese;
import com.atguigu.proxy.LoggingProxy;

public class Demo04 {
    public static void main(String[] args) {
        /*//1.创建目标类对象
        CalculatorImpl calculator = new CalculatorImpl();
        //2.创建代理类对象
        Calculator proxy = (Calculator) new LoggingProxy(calculator).createProxy();
        //3.代理类对象调取方法
        int i = proxy.add(10, 22);
        System.out.println("i = " + i);*/

        Person person = new Chinese();
        Person proxy1 = (Person) new LoggingProxy(person).createProxy();
        proxy1.eat("饺子");
    }
}
