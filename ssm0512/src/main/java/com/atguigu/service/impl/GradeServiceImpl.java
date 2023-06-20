package com.atguigu.service.impl;

import com.atguigu.bean.Grade;
import com.atguigu.dao.GradeMapper;
import com.atguigu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> findAllGrade() {
        return gradeMapper.findAllGrade();
    }
}
