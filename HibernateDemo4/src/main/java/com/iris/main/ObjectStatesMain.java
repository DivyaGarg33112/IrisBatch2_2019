package com.iris.main;

import org.hibernate.Session;

import com.iris.models.UserDetails;
import com.iris.utility.SessionFactoryProvider;

public class ObjectStatesMain {

	public static void main(String[] args) {

	Session session=SessionFactoryProvider.getSessionFactory().openSession();
	session.beginTransaction();
	
	
	//Transient state
	UserDetails uObj=new UserDetails();
	uObj.setUserName("Divya");

	session.save(uObj);
	
	//Now the uObj is in persistent state
	uObj.setUserName("Divya Garg");
	
	session.getTransaction().commit();
	session.close();
	
	//Now uObj is into detached state..
	uObj.setUserName("Divya Agarwal");
	
	}

}
