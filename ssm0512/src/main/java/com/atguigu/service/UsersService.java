package com.atguigu.service;

import com.atguigu.bean.Users;
import com.github.pagehelper.PageInfo;

public interface UsersService {
    public PageInfo<Users> findAllUsers(int pageNum, int pageSize);
}
