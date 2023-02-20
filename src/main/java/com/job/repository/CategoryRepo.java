package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
