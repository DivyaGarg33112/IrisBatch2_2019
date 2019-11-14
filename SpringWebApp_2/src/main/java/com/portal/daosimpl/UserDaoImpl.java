package com.portal.daosimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.portal.daos.UserDao;
import com.portal.models.User;


@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public boolean registerUser(User userObj) {
		try {
		Session session=sessionFactory.getCurrentSession();
		session.save(userObj);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public User validateUser(int Id, String password) {
		try {
		Session session=sessionFactory.getCurrentSession();
		User userObj=session.get(User.class, Id);
		
		//If object is found with the given ID 
		if(userObj!=null){
			if(userObj.getPassword().equals(password)){
				return userObj;
			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}









