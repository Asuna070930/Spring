package com.atguigu.controller;

import com.atguigu.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    //跳转testemp页面
    @RequestMapping("/testemp")//地址栏发送的请求
    public String demo() {
        return "testemp";//目标页面路径
    }

    //注册雇员
    @RequestMapping(value = "/regemp", method = RequestMethod.POST)
    public String regemp(Employee employee, Model model, ModelMap map) {
        System.out.println(employee);
        return "regsuccess";
    }
}
