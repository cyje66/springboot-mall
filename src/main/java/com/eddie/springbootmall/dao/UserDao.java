package com.eddie.springbootmall.dao;

import com.eddie.springbootmall.dto.UserRegisterRequest;
import com.eddie.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
