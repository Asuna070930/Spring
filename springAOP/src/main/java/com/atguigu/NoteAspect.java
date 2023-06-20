package com.atguigu;

import org.aspectj.lang.ProceedingJoinPoint;

//理解成切面类,但是现在这个类就是一个普通类
public class NoteAspect {
    public void beforeNote() {
        System.out.println("前置增强");
    }

    public void afterNote() {
        System.out.println("后置增强(最终增强)");
    }

    public void afterReturningNote(Object result) {
        System.out.println("返回增强,目标方法的返回结果：" + result);
    }

    public Object aroundNote(ProceedingJoinPoint proceedingJoinPoint) {
        Object obj = null;
        try {
            System.out.println("环绕增强开始");
            obj = proceedingJoinPoint.proceed();//调取目标方法
            System.out.println("环绕增强结束,目标方法的返回值是:" + obj);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

    public void afterException(Throwable e) {
        System.out.println("异常增强");
    }
}
