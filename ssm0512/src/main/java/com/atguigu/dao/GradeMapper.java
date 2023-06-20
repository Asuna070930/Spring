package com.atguigu.dao;

import com.atguigu.bean.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeMapper {
    //查询所有年级信息
    public  List<Grade> findAllGrade();
}
