package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestInterceptor {
    @ResponseBody
    @RequestMapping(value = "/testResponseBody")
    public String testResponseBody() {
        System.out.println("测试@ResponseBody注解");
        return "success";
    }

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        System.out.println("测试拦截器");
        return "success";
    }
}
