package com.iris.daos;

import com.iris.models.Person;

public interface PersonDao {
	
	public boolean updatePerson(Person pObj);
	public boolean addPerson(Person pObj);
	public Person getPersonById(int personId);
	public Person validate(int personId,String name);
	
}
