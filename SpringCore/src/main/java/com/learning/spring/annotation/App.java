package com.learning.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	//Annotation based configuration demo
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Vehicle bike = (Vehicle)context.getBean("bike");
        bike.drive();
        
        //Autowired demo
        Vehicle car = (Vehicle)context.getBean("car");
        car.drive();
    }
}
