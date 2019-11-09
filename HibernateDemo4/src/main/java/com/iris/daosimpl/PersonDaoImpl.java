package com.iris.daosimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.daos.PersonDao;
import com.iris.models.Person;
import com.iris.utility.SessionFactoryProvider;

public class PersonDaoImpl implements PersonDao{

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	@Override
	public boolean updatePerson(Person pObj) {
		try {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(pObj);
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

	@Override
	public Person validate(int personId, String name) {
		try {
			Session session=sf.openSession();
			Query<Person> query=session.createQuery
					("from com.iris.models.Person where personId=:x and personName=:y");
			query.setParameter("x", personId);
			query.setParameter("y", name);
			List<Person> pObj=query.list();
			session.close();
			if(pObj.size()!=0){
				return pObj.get(0);
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}return null;
		
	}
	
}
