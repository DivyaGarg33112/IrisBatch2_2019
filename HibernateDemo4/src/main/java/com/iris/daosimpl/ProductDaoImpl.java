package com.iris.daosimpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iris.daos.ProductDao;
import com.iris.models.Product;
import com.iris.utility.SessionFactoryProvider;

public class ProductDaoImpl implements ProductDao {

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	@Override
	public boolean addProduct(Product cObj) {
		try {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(cObj);
		tx.commit();		
		session.close();
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}


}
