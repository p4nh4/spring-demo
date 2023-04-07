package com.demo.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestBeanApplication {
    public static void main(String[] args) {
        //Spring Context use to manage the object
        try (AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TestBeanApplication.class);)
        {
            String[] beanNames = context.getBeanDefinitionNames();
            for( String beanName : beanNames)
            {
                System.out.println("=====================");
                System.out.println("bean name: "+beanName);
                System.out.println("---------------------");
            }

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
