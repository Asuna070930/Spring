package com.atguigu.text;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    @Test
    public void testa() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }

    //  byName 对象中的属性名=spring容器中对象的ID名
    //  byType 对象的类型(com.atguigu.bean.Grade) =spring容器中对象的类型
    @Test
    public void testb() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student stu7 = applicationContext.getBean("stu7", Student.class);
        System.out.println(stu7);
    }

    @Test
    public void testc() {
        //1.创建IOC容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring2.xml");
        //2.获取IOC容器中的stu对昂
        DruidDataSource ds = (DruidDataSource) ioc.getBean("dataSource");
        System.out.println(ds.getUrl());
        System.out.println(ds.getUsername());
        System.out.println(ds.getMaxActive());
        System.out.println(ds.getInitialSize());
        System.out.println(ds.getDriverClassName());
        System.out.println(ds.getPassword());
    }

    @Test
    public void testd() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring2.xml");
        // getBean("工厂类的id"),接收的时候，使用具体的实体类类型接收
        Student stu1 = (Student) ioc.getBean("fac");
        System.out.println(stu1);
        Student stu2 = (Student) ioc.getBean("fac");
        System.out.println(stu2);
    }
}
