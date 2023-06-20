package com.atguigu.bean;

public class BeanLife {
    private String name;

    public BeanLife() {
        System.out.println("BeanLisfe对象被创建");
    }

    public void setName(String name) {
        System.out.println("BeanLife的name属性被复制-setName()");
        this.name = name;
    }
}
