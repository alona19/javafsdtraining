package com.ust.spring;

import org.spri
public class TestSpring {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	      
	      Restarunt resobj=(Restarunt)context.getBean("restaurantBean");  
	      resobj.greetCustomer();
	}

}
