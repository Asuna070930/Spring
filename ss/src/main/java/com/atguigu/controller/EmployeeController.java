package com.atguigu.controller;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/findAllEmp")
    public String getEmps(Model model) {
        //查询所有雇员
        List<Employee> employeeList = employeeService.findAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        model.addAttribute("emplist", employeeList);
        return "showemp";
    }
}
