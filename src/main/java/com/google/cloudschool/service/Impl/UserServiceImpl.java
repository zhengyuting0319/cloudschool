package com.google.cloudschool.service.Impl;

import com.google.cloudschool.dao.UserMapper;
import com.google.cloudschool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int login(String username, String password) {
        return userMapper.login(username,password);
    }
}

