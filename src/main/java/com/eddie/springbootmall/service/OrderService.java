package com.eddie.springbootmall.service;

import com.eddie.springbootmall.dto.CreateOrderRequest;
import com.eddie.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
