package com.atguigu.text;

import com.atguigu.bean.HelloWorld;
import com.atguigu.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testHelloWorld() {
        // 1.使用ClassPathXmlApplicationContext加载配置文件
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*//2.FileSystemXmlApplicationContext("磁盘名:\\文件夹名\\配置文件名.xml")
        FileSystemXmlApplicationContext ioc = new FileSystemXmlApplicationContext("D:\\Java\\spring\\spring0427\\src\\main\\resources\\applicationContext.xml");*/
        //2.获取IOC容器中的HelloWorld对象
//        HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
        HelloWorld helloWorld1 = ioc.getBean(HelloWorld.class);
//        HelloWorld helloWorld2 = ioc.getBean("helloWordl", HelloWorld.class); //不实用
        //3.调用sayHello方法
        helloWorld1.sayHello();
        System.out.println(helloWorld1.getName());
    }

    @Test
    public void test2() {
        //1.创建IOC容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取IOC容器中的stu对象
        Student stu = (Student) ioc.getBean("stu");
        Object stu1 = ioc.getBean("stu");
        System.out.println(stu.getStuName());
        System.out.println(stu.getGrade().getGname());
    }

    @Test
    public void test3(){
        //1.创建IOC容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取IOC容器中的stu对象
        Student stu2 = (Student) ioc.getBean("stu2");
        System.out.println(stu2.getStuName());
        System.out.println(stu2);
    }
}
