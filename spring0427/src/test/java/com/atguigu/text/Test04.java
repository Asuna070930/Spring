package com.atguigu.text;

import com.atguigu.bean.BeanLife;
import com.atguigu.bean.Grade;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void testa() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring2.xml");
        BeanLife bean = app.getBean("mybeanlife", BeanLife.class);
    }
}
