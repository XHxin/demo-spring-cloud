package com.nelson.org;

import com.nelson.org.ProductApplication;
import com.nelson.org.entity.Product;
import com.nelson.org.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-11 16:13
 * @todo
 */
@SpringBootTest(classes = ProductApplication.class)
@RunWith(SpringRunner.class)
public class ProductServiceTest {
    @Resource
    private IProductService iProductService;

    @Test
    public void testGet() {
        System.out.println(iProductService.get(1));
    }

    @Test
    public void testAdd() {
        Product product = new Product() ;
        product.setProductName("iphone" + System.currentTimeMillis());
        System.out.println(iProductService.add(product));
    }
    @Test
    public void testList() {
        System.out.println(iProductService.list());
    }
}
