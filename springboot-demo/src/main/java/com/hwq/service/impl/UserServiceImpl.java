package com.hwq.service.impl;

import com.hwq.dao.UserMapper;
import com.hwq.entity.User;
import com.hwq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User select() {
        return userMapper.select();
    }
}
