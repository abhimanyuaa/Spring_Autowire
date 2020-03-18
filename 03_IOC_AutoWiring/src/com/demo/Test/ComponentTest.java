package com.demo.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Beans.Car;
import com.demo.Beans.Engine;

public class ComponentTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/SpringComponet.xml");

		Car c = (Car) context.getBean("car");
		c.setCarname("Audi");
		
		c.display();

	}

}
