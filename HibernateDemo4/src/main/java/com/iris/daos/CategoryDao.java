package com.iris.daos;

import java.util.List;

import com.iris.models.Category;

public interface CategoryDao {
	public boolean addCategory(Category cObj);
	public List<Category> getAllCategories();
	public Category getCategoryById(int id);
}
