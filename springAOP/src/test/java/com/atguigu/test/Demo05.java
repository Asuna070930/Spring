package com.atguigu.test;

import com.atguigu.aop.dao.CalculatorDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo05 {
    public static void main(String[] args) {
        //1.加载配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("spring_aop.xml");
        CalculatorDao cadao = app.getBean("cadao", CalculatorDao.class);
//        cadao.add(22,33);
        cadao.div(10,2);
    }
}
