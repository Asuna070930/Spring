package com.atguigu;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {
    @RequestMapping("/testRequestBody")
    public String a1(@RequestBody String data) {
        System.out.println(data);
        return "a1success";
    }

    @RequestMapping("/testHttpEntity")
    public String b1(HttpEntity<String> entity) {
        System.out.println(entity.getHeaders());
        System.out.println(entity.getBody());
        return "b1success";
    }

    @ResponseBody
    @RequestMapping(value = "/testResponseBody")
    public String testResponseBody() {
        System.out.println("测试@RequestMapping注解");
        return "success";
    }
}
