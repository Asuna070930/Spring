package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class TestResponseController {
    @RequestMapping("/testmodelandview")
    public ModelAndView aa() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");  //  /success.html
        //下面代码的作用等价于： request.setAttribute("keya","modelandview存储的数据")
        modelAndView.addObject("keya", "modelandview存储的数据");
        return modelAndView;
    }

    @RequestMapping("/testmodelmap")
    public String aa2(ModelMap modelMap, Map map, Model model) {
        modelMap.put("keyb", "modelmap的数据");
        map.put("keyc", "map存储的数据");
        model.addAttribute("keyd", "model存储的数据");
        return "success2";
    }
}
