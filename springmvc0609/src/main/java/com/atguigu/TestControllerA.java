package com.atguigu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControllerA {
    @RequestMapping("/test")
    public String demo01() {
        System.out.println("demo01()被执行");
//        return "testsuccess";//默认使用转发方式
        return "testsuccess";
    }

    @RequestMapping("/aa")
    public String aa() {
        System.out.println("aa()");
//        return "forward:/bb";//转发u
        return "redicect:/bb";//重定向
    }

    @RequestMapping("/bb")
    public String bb() {
        System.out.println("bb()");
        return "bbsuccess";
    }

}
