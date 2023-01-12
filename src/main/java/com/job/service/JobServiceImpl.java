package com.job.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.repository.JobRepo;

@Service
public class JobServiceImpl implements JobService{
	
	@Autowired
	private JobRepo jr;

}
