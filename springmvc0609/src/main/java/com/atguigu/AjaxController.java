package com.atguigu;

import com.atguigu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

//@Controller
@RestController
public class AjaxController {
    @RequestMapping("/testajax001")
    public String demo01(@RequestParam(name = "uname") String username, @RequestParam(name = "upass") String userpass) {
        System.out.println(username + userpass);
        return "success";
    }

    /*@RequestMapping("/testajax002")
    public String demo02(@RequestBody User user) {
        System.out.println(user);
        return "success";
    }*/

    @RequestMapping("/testajax002")
    public String demo03(@RequestBody Map<String, String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        return "success";
    }

    @RequestMapping("/testajax003")
    public String demo04(@RequestBody List<User> userlist) {
        for (User user : userlist) {
            System.out.println(user);
        }
        return "success";
    }

    @RequestMapping("/testajax004")
    public String demo05(@RequestBody User user) {
        System.out.println(user);
        System.out.println(user.getPet().getPetname());
        return "success";
    }
}
