package com.beanlifecycle.springbeanlifecycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean {

  public SpringBean() {
    System.out.println("SpringBean instance created");
  }

  // works automatically when the bean is instantiated
  @PostConstruct
  public void init() throws Exception {
    System.out.println("init() method that executed @PostConstruct");
  }

  // works automatically after Spring Container releases the bean(when Spring container is closed)
  @PreDestroy
  public void destroy() throws Exception {
    System.out.println("destroy() method that executed @PreDestroy");
  }

  public void close() {
    System.out.println("Closing resources");
  }
}
