package com.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.job.service.JobService;

@RestController("/job")
public class JobController {
	
	@Autowired
	private  JobService js;

}
