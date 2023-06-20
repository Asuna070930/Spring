package com.atguigu.text;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test05 {
    @Test
    public void testa() {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource dataSource = app.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getDriverClassName());
    }
}
