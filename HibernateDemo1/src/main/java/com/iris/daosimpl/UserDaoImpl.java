package com.iris.daosimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.daos.UserDao;
import com.iris.models.User;
import com.iris.utility.SessionFactoryProvider;

public class UserDaoImpl implements UserDao {

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	@Override
	public boolean saveUser(User uObj) {
		try {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(uObj);
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
	public User getUser(int userId) {
		try {
			Session session=sf.openSession();
			User userObj=session.get(User.class,userId);
			session.close();
			return userObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		try {
			Session session=sf.openSession();
			Query<User> query=
					session.createQuery("from com.iris.models.User");
			List<User> userList=query.list();
			return userList;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}


