package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Student> {
    //设置工厂类返回的对象
    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    //设置对象类型
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //设置当前bean是否是单例的,true表示单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
