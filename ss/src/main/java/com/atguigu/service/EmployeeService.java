package com.atguigu.service;

import com.atguigu.bean.Employee;

import java.util.List;

public interface EmployeeService {
    //查询所有雇员
    public List<Employee> findAll();
}
