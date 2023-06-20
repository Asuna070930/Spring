package com.atguigu.proxy;

import com.atguigu.dao.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//日志的代理类-定义日志的信息(方法执行前的和方法执行后的输出语句)
//使用jdk自己的动态大力Proxy
public class LoggingProxy {
    private Object target;

    public LoggingProxy(Object obj) {
        this.target = obj;
    }

    //创建代理类对象的方法
    public Object createProxy() {
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                System.out.println("Loggerbefore-methodName=" + name + ",params=" + Arrays.toString(args));
                Object rs = method.invoke(target, args);
                System.out.println("LoggerAfter-methodName=" + name + "result=" + rs);
                return rs;
            }
        });
        return obj;
    }
}
