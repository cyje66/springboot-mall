package com.eddie.springbootmall.service;

import com.eddie.springbootmall.dto.CreateOrderRequest;
import com.eddie.springbootmall.dto.OrderQueryParams;
import com.eddie.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
