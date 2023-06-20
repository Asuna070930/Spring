package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestRequestController {
    @RequestMapping("/reg")
    public String reg(@RequestParam(name = "username") String uname, @RequestParam(name = "uage", defaultValue = "18") String userage, @RequestHeader("Accept-Encoding") String encoding, @RequestHeader("Accept-language") String language/*, @CookieValue("JSESSIONID") String sessionid*/) {
        System.out.println(uname + userage);
        System.out.println(encoding + language);
//        System.out.println(sessionid);
        return "regsuccess";
    }

    @RequestMapping("/testdelete")
    public String testdelete() {
        System.out.println("testdelete----");
        return "aaaa";
    }

    @RequestMapping("/testput")
    public String testput() {
        System.out.println("testput----");
        return "testputsuccess";
    }
}
