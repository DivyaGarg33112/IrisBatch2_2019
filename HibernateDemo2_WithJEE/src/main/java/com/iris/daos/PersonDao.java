package com.iris.daos;

import com.iris.models.Person;

public interface PersonDao {
	
	public boolean addPerson(Person pObj);
	public Person getPersonById(int personId);
	
}
