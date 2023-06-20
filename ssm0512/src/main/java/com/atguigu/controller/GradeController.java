package com.atguigu.controller;

import com.atguigu.bean.Grade;
import com.atguigu.service.GradeService;
import com.atguigu.uitl.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @ResponseBody
    @RequestMapping("/findGrade")
    public CommonResult findgrade() {
        //查询所有的年级信息
        List<Grade> gradeList = gradeService.findAllGrade();
        CommonResult commonResult = new CommonResult();
        commonResult.setFlag(true);
        commonResult.setObjData(gradeList);
        return commonResult;
    }
}
