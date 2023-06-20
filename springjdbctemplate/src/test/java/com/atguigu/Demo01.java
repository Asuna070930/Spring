package com.atguigu;

import com.atguigu.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = app.getBean("jdbcTemplate", JdbcTemplate.class);

        //1.增加(事务自动提交)
        /*String sql = "insert into employee(last_name,email,salary) values(?,?,?)";
        int i = jdbcTemplate.update(sql, "张三a", "123@qq.com", 2233);
        System.out.println("i = " + i);

        //2.修改
        String sql = "update employee set last_name=? where id = ?";
        int i = jdbcTemplate.update(sql,"tom2-ssm",1);
        System.out.println("i = " + i);*/

        //3.批量新增
        /*//写sql语句
        String sql = "insert into employee(last_name,email,salary) values(?,?,?)";
        //创建一个List
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] arg1 = new Object[]{"李某宏", "liyanhong@baidu.com", 8888.00};
        Object[] arg2 = new Object[]{"刘某东", "liuqiangdong@jd.com", 7777.00};
        Object[] arg3 = new Object[]{"张某鸣", "zhangyiming@douyin.com", 6666.00};
        batchArgs.add(arg1);
        batchArgs.add(arg2);
        batchArgs.add(arg3);
        //调用JdbcTemplate中的批处理方法
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));*/

        //4.单行单列
        /*String sql = "select count(*) from employee";
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("i = " + i);*/

        /*String sql = "select max(salary) from employee";
        Double rs = jdbcTemplate.queryForObject(sql, Double.class);
        System.out.println("rs = " + rs);*/

        //5.单行查询
        /*//写sql语句
        String sql = "select * from employee where id = ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), 1);
        System.out.println(employee);*/

        //6.多行查询
        String sql = "select * from employee";
        List<Employee> employeeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        System.out.println(employeeList);
    }
}
