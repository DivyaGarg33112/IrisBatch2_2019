package com.iris.daosimpl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.daos.CategoryDao;
import com.iris.models.Category;
import com.iris.utility.SessionFactoryProvider;

public class CategoryDaoImpl implements CategoryDao {

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	@Override
	public boolean addCategory(Category cObj) {
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
	public List<Category> getAllCategories() {
		try {
			Session session=sf.openSession();
			Query<Category> query=
		session.createQuery("from com.iris.models.Category");
			List<Category> list=query.list();
			session.close();
			return list;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		try {
			Session session=sf.openSession();
			Category ob=session.get(Category.class,id);
			
			session.close();
			return ob;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}
