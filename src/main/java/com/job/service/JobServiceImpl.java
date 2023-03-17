package com.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.exception.CategoryException;
import com.job.exception.JobException;
import com.job.model.Job;
import com.job.repository.JobRepo;

@Service
public class JobServiceImpl implements JobService{
	
	@Autowired
	private JobRepo jr;

	@Override
	public Job addJob(Integer categoryId, Job job) throws CategoryException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job getJob(Integer jobId) throws JobException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job deleteJob(Integer jobId) throws JobException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job updateJob(Job job) throws JobException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> getAllJob() throws JobException {
		// TODO Auto-generated method stub
		return null;
	}

}
