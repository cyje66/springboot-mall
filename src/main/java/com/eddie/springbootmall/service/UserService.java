package com.eddie.springbootmall.service;

import com.eddie.springbootmall.dto.UserRegisterRequest;
import com.eddie.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
