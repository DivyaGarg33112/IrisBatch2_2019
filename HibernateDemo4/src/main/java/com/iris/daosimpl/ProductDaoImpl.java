package com.iris.daosimpl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

	@Override
	public List<Product> getAllProducts() {
		Session session=sf.openSession();
		Query<Product> query=session.createQuery("from com.iris.models.Product");
		List<Product> productList=query.list();
		session.close();
		return productList;
	}

	@Override
	public List<Product> getAllProducts(int categoryId) {
		Session session=sf.openSession();
		Query<Product> query=session.createQuery("from com.iris.models.Product WHERE category.categoryId=:cId");
		query.setParameter("cId", categoryId);
		List<Product> products=query.list();
		session.close();
		return products;
	}


}
