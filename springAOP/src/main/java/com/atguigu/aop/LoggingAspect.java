package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect
@Component
@Order(value = 2)
public class LoggingAspect {

    @Pointcut("execution(* com.atguigu.aop.dao.impl.*.*(..))")
    public void abc(){}
    //定义通知方法-前置通知
    //value 指定目标方法的格式
    @Before(value = "abc()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("前置通知(前置增强),方法名=" + joinPoint.getSignature().getName() + ",方法参数:" + Arrays.toString(joinPoint.getArgs()));
    }

    //返回通知,returning=“返回值绑定的变量名”，这个变量名来自于被修饰的方法的参数名
    ////程序运行时会将返回值自动绑定到returning声明的变量中，再将变量的值赋值给返回增强的方法的参数上
    @AfterReturning(value = "abc()",returning = "obj")
    public void afterMethod(Object obj) {
        System.out.println("返回通知,返回值是:"+obj);
    }

    //后置通知(最终通知)
    @After(value = "abc()")
    public void afterAll(JoinPoint joinPoint) {
        System.out.println("最终通知 "+ joinPoint.getSignature().getName() + ",方法参数:" + Arrays.toString(joinPoint.getArgs()));
    }

    //异常通知
    @AfterThrowing(value = "abc()",throwing = "e")
    public void afterException(Throwable e) {
        System.out.println("异常通知,异常信息:"+e.getMessage());
    }

    //环绕通知=前置通知+返回通知
    @Around(value = "abc()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object rs = null;
        System.out.println("环绕开始");
        try {
            rs = proceedingJoinPoint.proceed();//执行目标方法
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("环绕结束,rs="+rs);
        return rs;
    }
}
