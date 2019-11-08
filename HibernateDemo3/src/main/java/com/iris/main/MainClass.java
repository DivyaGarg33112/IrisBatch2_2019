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
	
	Address addr1=new Address();
	addr1.setAddressLine1("272 , Harmukhpuri, Modinagar");
	addr1.setAddressLine2("Uttar Pradesh");
	
	Address addr2=new Address();
	addr2.setAddressLine1("Model Town");
	addr2.setAddressLine2("Ghaziabad");
	
	p.setPresentAddress(addr2);
	p.setPermanentAddress(addr1);
	
		
	PersonDao daoObj=new PersonDaoImpl();
	daoObj.addPerson(p);
	System.out.println("Person Added Succesfully...");
	
		
	}

}
