package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.model.Job;

public interface JobRepo extends JpaRepository<Job, Integer>{

}
