package com.atguigu.service.impl;

import com.atguigu.bean.Users;
import com.atguigu.dao.UsersMapper;
import com.atguigu.service.UsersService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public PageInfo<Users> findAllUsers(int pageNum, int pageSize) {
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Users> usersList = usersMapper.findAllUsers();
        PageInfo<Users> usersPageInfo = new PageInfo<>(usersList);
        return usersPageInfo;
    }
}
