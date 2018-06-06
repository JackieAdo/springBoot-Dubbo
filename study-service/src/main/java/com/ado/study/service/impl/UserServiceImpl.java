package com.ado.study.service.impl;

import com.ado.study.mapper.UserMapper;
import com.ado.study.model.User;
import com.ado.study.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jackie
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
