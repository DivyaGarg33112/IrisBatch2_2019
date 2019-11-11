package com.iris.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.User;
import com.iris.models.Vehicle;
import com.iris.utility.SessionFactoryProvider;

public class OneToOneDemo {

	public static void main(String[] args) {
	
	Session session=SessionFactoryProvider.getSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	
	Vehicle vObj=new Vehicle();
	vObj.setVehicleNumber(4715);
	vObj.setCompany("Hyundai");
	vObj.setType("2-Wheeler");
	
	
	User userObj=new User();
	userObj.setUserId(102);
	userObj.setUserName("Yash");
	userObj.setVehicle(vObj);
	
	session.save(vObj);
	session.save(userObj);
	
	tx.commit();
	session.close();
	
	

	}

}
