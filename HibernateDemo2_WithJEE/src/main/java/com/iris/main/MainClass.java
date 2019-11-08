package com.iris.main;

import com.iris.daos.PersonDao;
import com.iris.daosimpl.PersonDaoImpl;
import com.iris.models.Address;
import com.iris.models.Person;

public class MainClass {

	public static void main(String[] args) {

	Person p=new Person();
	p.setPersonId(101);
	p.setPersonName("Divya");
	p.setPersonAge(29);
	
	Address addr=new Address();
	addr.setAddressLine1("272 , Harmukhpuri, Modinagar");
	addr.setAddressLine2("Uttar Pradesh");
	
	p.setPersonAddress(addr);
		
	PersonDao daoObj=new PersonDaoImpl();
	daoObj.addPerson(p);
	System.out.println("Person Added Succesfully...");
	
		
	}

}
