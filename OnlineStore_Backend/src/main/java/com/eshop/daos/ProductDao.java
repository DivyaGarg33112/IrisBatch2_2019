package com.eshop.daos;

import java.util.List;

import com.eshop.models.Product;

public interface ProductDao {
	public boolean addProduct(Product pObj);
	public boolean deleteProduct(Product pObj);
	public boolean updateProduct(Product pObj);
	public Product getProductById(int pId);
	public List<Product> getAllProducts();
}
