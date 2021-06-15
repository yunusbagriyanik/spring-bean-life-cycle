package com.beanlifecycle.springbeanlifecycle.bean;

import org.springframework.beans.factory.InitializingBean;

public class ProductBean implements InitializingBean {
  private String productName;

  public ProductBean() {
    System.out.println("ProductBean constructor called.");
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  @Override
  public String toString() {
    return "ProductBean{" +
        "productName='" + productName + '\'' +
        '}';
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("ProductBean.afterPropertiesSet() method");
  }
}
