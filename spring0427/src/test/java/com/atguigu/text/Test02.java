package com.atguigu.text;

import com.atguigu.bean.MyBean;
import com.atguigu.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test02 {
    @Test
    public void testa() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Student stu5 = (Student) applicationContext.getBean("stu5");
        System.out.println(stu5);
    }

    @Test
    public void testb() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Student stu = applicationContext.getBean("stu", Student.class);
        System.out.println(stu);
    }

    @Test
    public void testc() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");
        Student stu6 = applicationContext.getBean("stu6", Student.class);
        System.out.println(stu6);
    }

    @Test
    public void testd() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        MyBean myBean = applicationContext.getBean("mybeantest", MyBean.class);
        System.out.println(myBean.getDataList());
        System.out.println(Arrays.toString(myBean.getDataArray()));
        System.out.println(myBean.getDataSet());
        System.out.println(myBean.getDataMap());
        System.out.println(myBean.getDataProperties());
    }
}
