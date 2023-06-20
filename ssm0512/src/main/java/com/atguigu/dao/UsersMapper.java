package com.atguigu.dao;

import com.atguigu.bean.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {
    //查询所有用户的方法
    public List<Users> findAllUsers();
}
