package com.eddie.springbootmall.service;

import com.eddie.springbootmall.dto.CreateOrderRequest;
import com.eddie.springbootmall.model.Order;
import com.eddie.springbootmall.model.OrderItem;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
