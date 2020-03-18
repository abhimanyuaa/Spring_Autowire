package com.demo.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Beans.Car;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring_byName.xml");
		
		Car c= (Car) context.getBean("c");
		
		c.display();
		
	}
}
