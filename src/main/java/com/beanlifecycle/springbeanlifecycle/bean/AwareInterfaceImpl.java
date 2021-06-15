package com.beanlifecycle.springbeanlifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class AwareInterfaceImpl implements BeanNameAware, BeanFactoryAware {

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("beanInstance is singleton : " + beanFactory.isSingleton("beanInstance"));
  }

  @Override
  public void setBeanName(String beanName) {
    System.out.println("bean name is " + beanName);
  }
}
