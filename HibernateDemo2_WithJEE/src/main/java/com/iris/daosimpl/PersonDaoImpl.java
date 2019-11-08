package com.iris.daosimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iris.daos.PersonDao;
import com.iris.models.Person;
import com.iris.utility.SessionFactoryProvider;

public class PersonDaoImpl implements PersonDao{

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	@Override
	public boolean addPerson(Person pObj) {
		try {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(pObj);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Person getPersonById(int personId) {
		try {
		Session session=sf.openSession();
		Person pObj=session.get(Person.class, personId);
		session.close();
		return pObj;
		}
		catch(Exception e){
			e.printStackTrace();
		}return null;
	}
	
}
