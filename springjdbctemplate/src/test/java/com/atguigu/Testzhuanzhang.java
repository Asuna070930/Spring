package com.atguigu;

import com.atguigu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testzhuanzhang {
    public static void main(String[] args) {
        //调取service层转账方法
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountservice = applicationContext.getBean("accountservice", AccountService.class);
        accountservice.zhuanzhang(1,2,10);
    }
}
