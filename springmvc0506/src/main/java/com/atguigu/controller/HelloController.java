package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//处理类，功能等价于原来的Servlet,springmvc中不允许直接访问静态页面，必须通过请求才能方法
//假定： http://localhost:80/test  ->>> testa.html   由controller类完成
//@RequestMapping("/springmvcdemo") // http://localhost:80/springmvcdemo/test
@Controller
public class HelloController {
    //定义处理请求的方法
    @RequestMapping({"/index/{username}/{password}","/index/{username}"})
    public String toIndex(
            @PathVariable(value = "username") String uname,
            @PathVariable(value = "password" ,required = false)
            @RequestParam(defaultValue = "654321") String pword
    ){
        System.out.println(uname);
        System.out.println(pword);
        return "success";
    }

    //@RequestMapping("/testAnt/?/ant")
    //@RequestMapping("/testAnt/*/ant")
    @RequestMapping("/testAnt/**/ant")
    public String testAnt(){
        System.out.println("测试Ant风格的URL");
        return "success";
    }

    @RequestMapping("/test")
    public String hello() {
        System.out.println("hello()被执行");
        //  前缀: /   后缀：.html     ===》  /testa.html
        return "testa";//这里返回的目标页面的名称路径
    }

    @RequestMapping(value = {"/testspringmvc", "/testspringmvc2"}, method = RequestMethod.POST)
    public String abc() {
        System.out.println("abc()");
        return "success";
    }

    @RequestMapping(value = "/a1", params = {"uname"})// 表示a1请求发送的时候，必须有uname参数
    public String a1() {
        System.out.println("a1()");
        return "success";
    }
}
