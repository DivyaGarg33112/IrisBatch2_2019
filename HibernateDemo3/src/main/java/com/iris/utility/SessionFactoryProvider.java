package com.iris.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	
	private static SessionFactory sf;
	
	static {
		Configuration cfg=new Configuration();
		
		//by default will search for hibernate.cfg.xml. To use any
		//other name of xml pass it in configure method within
		//double quotes
		cfg.configure();
		
		
		sf=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sf;
	}
}
