package com.ust.spring;

	import org.springframework.beans.factory.BeanFactory;  
	import org.springframework.beans.factory.xml.XmlBeanFactory;  
	import org.springframework.core.io.ClassPathResource;  
	import org.springframework.core.io.Resource;
	

import com.ust.student.Student;  
	  
	@SuppressWarnings("deprecation")
	public class Test {  
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("Config.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
      
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();  
	}  
	}  


