package com.iris.main;

import java.util.HashSet;
import java.util.Set;
import com.iris.daos.PersonDao;
import com.iris.daosimpl.PersonDaoImpl;
import com.iris.models.Address;
import com.iris.models.Person;

public class MainClass {

	public static void main(String[] args) {
	Address addr1=new Address();
	addr1.setAddressLine1("272 , Harmukhpuri, Modinagar");
	addr1.setAddressLine2("Uttar Pradesh");
			
	Address addr2=new Address();
	addr2.setAddressLine1("45 , Model Town");
	addr2.setAddressLine2("Ghaziabad");
	
	Address addr3=new Address();
	addr3.setAddressLine1("11 , Yamuna Vihar");
	addr3.setAddressLine2("Delhi");
	
	Set<Address> s=new HashSet<>();
	s.add(addr1);
	s.add(addr2);
	s.add(addr3);
		
		
	Person p=new Person();
	p.setPersonId(101);
	p.setPersonName("Divya");
	p.setPersonAge(29);
	p.setAddrSet(s);
	
	PersonDao daoObj=new PersonDaoImpl();
	daoObj.addPerson(p);
	System.out.println("Person Added Succesfully...");
	
		
	}

}
