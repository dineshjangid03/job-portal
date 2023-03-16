package com.job.service;

import java.util.List;

import com.job.exception.JobException;
import com.job.model.Job;

public interface JobService {
	
	public Job addJob(Integer categoryId, Job job);
	
	public Job getJob(Integer jobId)throws JobException;
	
	public Job deleteJob(Integer jobId)throws JobException;
	
	public Job updateJob(Job job)throws JobException;
	
	public List<Job> getAllJob()throws JobException;

}
