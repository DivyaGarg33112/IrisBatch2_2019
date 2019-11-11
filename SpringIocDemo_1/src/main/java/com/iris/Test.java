package com.iris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args){
			ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");

			/*Laptop lObj1=context.getBean("obj1",Laptop.class);
		lObj1.printLaptopDetails();


		Laptop lObj2=context.getBean("obj2",Laptop.class);
		lObj2.printLaptopDetails();

		Laptop lObj3=context.getBean("obj3",Laptop.class);
		lObj3.printLaptopDetails();

			Car car=(Car)context.getBean("cObj1");
System.out.println(car);*/
}
}