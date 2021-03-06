package com.eshop.daosimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.daos.ProductDao;
import com.eshop.models.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addProduct(Product pObj) {
		try {
		Session session=sessionFactory.getCurrentSession();
		session.persist(pObj);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProduct(Product pObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.delete(pObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public boolean updateProduct(Product pObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.update(pObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public Product getProductById(int pId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Product pro=session.get(Product.class,pId);
			return pro;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public List<Product> getAllProducts() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.eshop.models.Product");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}

}
