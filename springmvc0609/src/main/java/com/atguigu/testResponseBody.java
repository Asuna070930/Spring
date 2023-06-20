package com.atguigu;

import com.atguigu.bean.Department;
import com.atguigu.bean.Employee;
import com.atguigu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class testResponseBody {
    //1.响应单个对象
    @ResponseBody
    @RequestMapping("/testResponseBody2")
    public Employee testResponseBody2() {
        System.out.println("测试@ResponseBody注解2");
        Employee employee = new Employee();
        employee.setLastName("刘能");
        employee.setEmail("liuneng@qq.com");
        Department department = new Department();
        department.setDepartmentName("象牙山");
        employee.setDepartment(department);
        return employee;
    }

    //2.响应对象集合
    @ResponseBody
    @RequestMapping("/responseJSONS")
    public List<Employee> responseJSONS() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setLastName("李四" + i);
            employee.setId(i + 10);
            Department department = new Department();
            department.setDepartmentName("部门" + i);
            employee.setDepartment(department);
            list.add(employee);
        }
        return list;
    }

    //3.相应对象集合
    @ResponseBody
    @RequestMapping("/responseJSONS2")
    public User responseJSONS2(){
        User user = new User("zahgsan","22",new Date());
        System.out.println(user);
        return user;
    }
}
