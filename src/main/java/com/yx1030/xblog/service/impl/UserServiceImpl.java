package com.yx1030.xblog.service.impl;

import com.yx1030.xblog.mapper.UserMapper;
import com.yx1030.xblog.pojo.User;
import com.yx1030.xblog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public  class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectById(id);
    }
}
