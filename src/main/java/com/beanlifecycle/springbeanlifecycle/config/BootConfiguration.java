package com.beanlifecycle.springbeanlifecycle.config;

import com.beanlifecycle.springbeanlifecycle.bean.AwareInterfaceImpl;
import com.beanlifecycle.springbeanlifecycle.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BootConfiguration {

  // if no name is assigned, it uses the method name by default.
  @Bean(name = "beanInstance")
  public AwareInterfaceImpl beanInstance() {
    return new AwareInterfaceImpl();
  }

  @Bean
  @Scope(value = "prototype")
  public SpringBean myBean() {
    return new SpringBean();
  }

}
