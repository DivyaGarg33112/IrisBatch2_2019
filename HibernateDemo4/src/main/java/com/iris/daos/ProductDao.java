package com.iris.daos;

import java.util.List;

import com.iris.models.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public List<Product> getAllProducts();
	public List<Product> getAllProducts(int categoryId);
	
}
