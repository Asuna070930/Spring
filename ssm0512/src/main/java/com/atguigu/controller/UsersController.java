package com.atguigu.controller;

import com.atguigu.bean.Users;
import com.atguigu.service.UsersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    //查询所有用户方法
    @RequestMapping(value = {"/getusers/{pnum}", "/getusers"})
    public String findAll(@PathVariable(value = "pnum",required = false) Integer pageNum, Model model) {
        if (pageNum == null) {
            pageNum = 1;
        }
//        List<Users> usersList = usersService.findAllUsers();
        PageInfo<Users> pageInfo = usersService.findAllUsers(pageNum, 4);
        System.out.println(pageInfo);
        model.addAttribute("pg", pageInfo);
        return "showusers";
    }
}
