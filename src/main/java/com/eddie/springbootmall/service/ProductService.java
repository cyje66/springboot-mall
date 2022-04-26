package com.eddie.springbootmall.service;

import com.eddie.springbootmall.dto.ProductRequest;
import com.eddie.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
