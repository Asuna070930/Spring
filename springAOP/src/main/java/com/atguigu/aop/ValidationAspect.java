package com.atguigu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
@Component
@Order(value = 1)
public class ValidationAspect {
    @Before("com.atguigu.aop.LoggingAspect.abc()")
    public void before(){
        System.out.println("前置增强2");
    }
}
