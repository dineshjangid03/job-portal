package com.job.service;

import java.util.List;

import com.job.exception.CategoryException;
import com.job.model.Category;


public interface CategoryService {

	public Category addCategory(Category category);
	
	public Category getCategory(Integer categoryId)throws CategoryException;
	
	public Category deleteCategory(Integer categoryId)throws CategoryException;
	
	public Category updateCategory(Category category)throws CategoryException;
	
	public List<Category> getAllCategory()throws CategoryException;
	
}
