package com.atguigu.test;

import com.atguigu.bean.Student;
import com.atguigu.cglibproxy.MyMethodInterceptor;

public class Demo03 {
    public static void main(String[] args) {
        //1.创建目标对象
        Student student = new Student();
        //2.创建代理对象
        Student proxy = new MyMethodInterceptor(student).createProxy();
        //3.代理对象调取目标方法
        proxy.study();
    }
}
