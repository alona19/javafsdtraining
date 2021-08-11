package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.
public class Test {
	 ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
     Restaurant resobj=(Restaurant)context.getBean("restaurantBean"); 
     resobj.greetCustomer();
}
