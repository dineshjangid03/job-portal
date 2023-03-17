package com.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.exception.CategoryException;
import com.job.model.Category;
import com.job.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepo cr;

	@Override
	public Category addCategory(Category category) {
		return cr.save(category);
	}

	@Override
	public Category getCategory(Integer categoryId) throws CategoryException {
		Optional<Category>opt=cr.findById(categoryId);
		if(opt.isEmpty()) {
			throw new CategoryException("category not found with id "+categoryId);
		}
		return opt.get();
	}

	@Override
	public Category deleteCategory(Integer categoryId) throws CategoryException {
		Optional<Category>opt=cr.findById(categoryId);
		if(opt.isEmpty()) {
			throw new CategoryException("category not found with id "+categoryId);
		}
		
		cr.delete(opt.get());
		
		return opt.get();
	}

	@Override
	public Category updateCategory(Category category) throws CategoryException {
		Optional<Category>opt=cr.findById(category.getId());
		if(opt.isEmpty()) {
			throw new CategoryException("category not found with id "+category.getId());
		}
		Category saved=opt.get();
		
		if(category.getName()!=null) {
			saved.setName(category.getName());
		}
		
		return cr.save(saved);
	}

	@Override
	public List<Category> getAllCategory() throws CategoryException {
		List<Category>list=cr.findAll();
		
		if(list.isEmpty()) {
			throw new CategoryException("list is empty");
		}
		
		return list;
	}

}
