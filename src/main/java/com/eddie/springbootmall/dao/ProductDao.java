package com.eddie.springbootmall.dao;

import com.eddie.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
