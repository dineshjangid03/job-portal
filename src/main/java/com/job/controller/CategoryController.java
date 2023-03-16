package com.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.exception.CategoryException;
import com.job.model.Category;
import com.job.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService cs;
	
	@PostMapping("/add")
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		return new ResponseEntity<Category>(cs.addCategory(category),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable("id") Integer categoryId) throws CategoryException{
		return new ResponseEntity<Category>(cs.getCategory(categoryId),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Category> deleteCategory(@PathVariable("id") Integer categoryId) throws CategoryException{
		return new ResponseEntity<Category>(cs.deleteCategory(categoryId),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category) throws CategoryException{
		return new ResponseEntity<Category>(cs.updateCategory(category),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Category>> getAllCategory() throws CategoryException{
		return new ResponseEntity<List<Category>>(cs.getAllCategory(),HttpStatus.ACCEPTED);
	}

}
