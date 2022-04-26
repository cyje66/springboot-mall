package com.eddie.springbootmall.service.impl;

import com.eddie.springbootmall.dao.ProductDao;
import com.eddie.springbootmall.model.Product;
import com.eddie.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}