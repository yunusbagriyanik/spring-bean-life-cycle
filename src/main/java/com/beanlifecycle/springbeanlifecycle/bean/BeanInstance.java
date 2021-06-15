package com.beanlifecycle.springbeanlifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInstance implements InitializingBean, DisposableBean {
  private String var;

  public String getVar() {
    return var;
  }

  public void setVar(String var) {
    this.var = var;
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("BeanInstance.destroy() method called");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("BeanInstance.afterPropertiesSet() method called");
  }
}
