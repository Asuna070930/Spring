package com.atguigu.dao;

import com.atguigu.bean.Employee;

import java.util.List;

public interface EmployeeDao {
    //查询所有雇员
    public List<Employee> findAll();
}
