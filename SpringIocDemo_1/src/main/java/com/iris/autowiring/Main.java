package com.iris.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
		Circle obj=context.getBean("circleObj",Circle.class);
		System.out.println(obj);

	}

}
