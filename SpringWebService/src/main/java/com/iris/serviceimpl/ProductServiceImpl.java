package com.iris.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.ProductDao;
import com.iris.models.Product;
import com.iris.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public boolean addProduct(Product pObj) {
		return productDao.addProduct(pObj);
	}

	@Override
	public boolean deleteProduct(Product pObj) {
		return productDao.deleteProduct(pObj);
	}

	@Override
	public boolean updateProduct(Product pObj) {
		return productDao.updateProduct(pObj);
	}

	@Override
	public Product getProductById(int pId) {
		return productDao.getProductById(pId);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

}
