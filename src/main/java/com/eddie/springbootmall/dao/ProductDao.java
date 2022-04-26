package com.eddie.springbootmall.dao;

import com.eddie.springbootmall.dto.ProductRequest;
import com.eddie.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
