package com.atguigu.test;

import com.atguigu.dao.Person;
import com.atguigu.dao.impl.Chinese;
import com.atguigu.staticproxy.PersonProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo02 {
    public static void main(String[] args) {
        //1.创建目标对象
        Person chinese = (Person) new Chinese();
        //2.创建代理对象
        Person proxyInstance = (Person) Proxy.newProxyInstance(chinese.getClass().getClassLoader(), chinese.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始吃饭");
                Object obj = method.invoke(chinese, args);//调取目标方法
                System.out.println("结束吃饭");
                return obj;
            }
        });
        //3.调取目标方法
//        proxyInstance.eat("饺子");
        proxyInstance.sleep();
    }
}
