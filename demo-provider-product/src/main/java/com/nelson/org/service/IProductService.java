package com.nelson.org.service;

import com.nelson.org.entity.Product;

import java.util.List;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-11 14:50
 * @todo
 */
public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}
