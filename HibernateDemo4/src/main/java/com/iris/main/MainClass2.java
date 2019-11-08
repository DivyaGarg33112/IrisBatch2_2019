package com.iris.main;

import com.iris.daos.PersonDao;
import com.iris.daosimpl.PersonDaoImpl;
import com.iris.models.Address;
import com.iris.models.Person;

public class MainClass2 {

	public static void main(String[] args) {

	PersonDao daoObj=new PersonDaoImpl();
	Person p=daoObj.getPersonById(101);
	if(p==null){
		System.out.println("Person with given id doesnt exist");
	}
	else {
		System.out.println(p);
	}
		
	}

}
