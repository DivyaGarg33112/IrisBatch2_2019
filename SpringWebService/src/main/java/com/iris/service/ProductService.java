package com.iris.service;

import java.util.List;
import com.iris.models.Product;

public interface ProductService {
	public boolean addProduct(Product pObj);
	public boolean deleteProduct(Product pObj);
	public boolean updateProduct(Product pObj);
	public Product getProductById(int pId);
	public List<Product> getAllProducts();
}
