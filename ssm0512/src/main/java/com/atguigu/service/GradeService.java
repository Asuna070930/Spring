package com.atguigu.service;

import com.atguigu.bean.Grade;

import java.util.List;

public interface GradeService {
    //查询所有年级信息
    public List<Grade> findAllGrade();
}
