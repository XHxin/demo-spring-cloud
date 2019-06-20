package com.nelson.org.mapper;

import com.nelson.org.entity.Product;

import java.util.List;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-20 14:56
 * @todo
 */
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
}