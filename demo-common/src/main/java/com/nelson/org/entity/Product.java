package com.nelson.org.entity;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-20 14:45
 * @todo
 */
public class Product {
    private String name;
    private Long productId;
    private String productName;
    private String productDesc;

    public String getProductDesc() {
        return productDesc;
    }
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
