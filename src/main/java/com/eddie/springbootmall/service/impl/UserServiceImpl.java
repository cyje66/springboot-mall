package com.eddie.springbootmall.service.impl;

import com.eddie.springbootmall.dao.UserDao;
import com.eddie.springbootmall.dto.UserRegisterRequest;
import com.eddie.springbootmall.model.User;
import com.eddie.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
