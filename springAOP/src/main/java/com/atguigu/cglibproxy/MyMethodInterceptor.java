package com.atguigu.cglibproxy;

import com.atguigu.bean.Student;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    //传入目标对象
    private Student student;

    public MyMethodInterceptor(Student student) {
        this.student = student;
    }

    //创建代理对象的方法
    public Student createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(student.getClass());
        return (Student) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("学习前线预习");
        methodProxy.invokeSuper(o,objects);//调取学习方法
        System.out.println("学习后复习");
        return null;
    }
}
