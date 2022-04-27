package com.eddie.springbootmall.dao;

import com.eddie.springbootmall.dto.ProductQueryParams;
import com.eddie.springbootmall.dto.ProductRequest;
import com.eddie.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
