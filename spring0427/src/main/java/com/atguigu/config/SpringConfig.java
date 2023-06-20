package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.atguigu")
@PropertySource("classpath:druid.properties")
public class SpringConfig {
    @Value("${jdbc_driverClassName}")
    private String driverClass;
    @Value("${jdbc_url}")
    private String url;
    @Value("${jdbc_username}")
    private String uname;
    @Value("${jdbc_password}")
    private String upass;

    //创建对象
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setPassword(upass);
        dataSource.setUsername(uname);
        dataSource.setDriverClassName(driverClass);
        return dataSource;
    }
}
