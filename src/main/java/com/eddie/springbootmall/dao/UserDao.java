package com.eddie.springbootmall.dao;

import com.eddie.springbootmall.dto.UserRegisterRequest;
import com.eddie.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
