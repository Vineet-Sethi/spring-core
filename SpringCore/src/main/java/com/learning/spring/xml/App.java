package com.learning.spring.xml;

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
        /*Car car = new Car();       // Dependencies on both sides - Tight coupling
        car.drive();
        
        Vehicle veh = new Car();     // Abstraction removes dependency for the references(veh). Still tight coupling as new keyword is used
        veh.drive();
        Vehicle veh2 = new Bike();
        veh2.drive();*/
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Loose coupling via spring dependency injection
        Vehicle vehicle = (Vehicle)context.getBean("vehicle");
        vehicle.drive();
        
        Tyre t = (Tyre)context.getBean("tyre");
        System.out.println(t);
    }
}
