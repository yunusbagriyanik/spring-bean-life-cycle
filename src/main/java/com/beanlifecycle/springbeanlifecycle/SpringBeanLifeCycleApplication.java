package com.beanlifecycle.springbeanlifecycle;

import com.beanlifecycle.springbeanlifecycle.bean.*;
import com.beanlifecycle.springbeanlifecycle.config.BootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@Import(value = BootConfiguration.class)
public class SpringBeanLifeCycleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBeanLifeCycleApplication.class, args);

//    AbstractApplicationContext context1 =
//        new ClassPathXmlApplicationContext("beans.xml");
//    AwareInterfaceImpl springBean = (AwareInterfaceImpl) context1.getBean("beanInstance");
//    context1.close();

//    AbstractApplicationContext context2 =
//        new ClassPathXmlApplicationContext("beans.xml");
//    ProductBean productBean = (ProductBean) context2.getBean("productBean");
//    context2.registerShutdownHook();

//    ApplicationContext context3 =
//        new ClassPathXmlApplicationContext("beans.xml");
//    BeanInstance beanInstance = (BeanInstance) context3.getBean("beanInstance");
//    System.out.println("BeanInstance.getVar()" + beanInstance.getVar());
//    ((AbstractApplicationContext) context3).registerShutdownHook();

//    AbstractApplicationContext context4 =
//        new ClassPathXmlApplicationContext("beans.xml");
//    CustomBean customBean = (CustomBean) context4.getBean("customBean");
//    context4.registerShutdownHook();

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(BootConfiguration.class);
    ctx.refresh();

    SpringBean obj1 = ctx.getBean(SpringBean.class);
    System.out.println(obj1.hashCode());

    SpringBean obj2 = ctx.getBean(SpringBean.class);
    System.out.println(obj2.hashCode());

    ctx.close();

  }
}
