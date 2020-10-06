package com.gengdan.demo.service.impl;

import com.gengdan.demo.entity.User;
import com.gengdan.demo.mapper.UserMapper;
import com.gengdan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/10/6 10:36
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
