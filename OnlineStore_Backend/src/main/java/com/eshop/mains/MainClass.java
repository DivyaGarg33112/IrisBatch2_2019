package com.eshop.mains;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshop.config.DBConfig;


public class MainClass {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DBConfig.class);
		
	}
	
}
