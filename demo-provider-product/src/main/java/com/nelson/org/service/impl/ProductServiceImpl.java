package com.nelson.org.service.impl;

import com.nelson.org.entity.Product;
import com.nelson.org.mapper.ProductMapper;
import com.nelson.org.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-11 15:22
 * @todo
 */


@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}