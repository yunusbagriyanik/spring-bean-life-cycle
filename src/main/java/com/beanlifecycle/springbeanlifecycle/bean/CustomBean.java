package com.beanlifecycle.springbeanlifecycle.bean;

public class CustomBean {
  private String var;

  public CustomBean() {
    System.out.println("CustomBean constructor called");
  }

  public String getVar() {
    return var;
  }

  public void setVar(String var) {
    this.var = var;
  }

  public void destroy() {
    System.out.println("Custom destroy method called");
  }
  public void init() {
    System.out.println("Custom init method called");
  }

  @Override
  public String toString() {
    return "CustomBean{" +
        "var='" + var + '\'' +
        '}';
  }
}
