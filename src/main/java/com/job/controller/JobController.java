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

import com.job.exception.JobException;
import com.job.model.Job;
import com.job.service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	private  JobService js;
	
	@PostMapping("/add/{categoryId}")
	public ResponseEntity<Job> addJob(@PathVariable("categoryId") Integer categoryId, @RequestBody Job Job){
		return new ResponseEntity<Job>(js.addJob(categoryId, Job),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Job> getJob(@PathVariable("id") Integer JobId) throws JobException{
		return new ResponseEntity<Job>(js.getJob(JobId),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Job> deleteJob(@PathVariable("id") Integer JobId) throws JobException{
		return new ResponseEntity<Job>(js.deleteJob(JobId),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Job> updateJob(@RequestBody Job Job) throws JobException{
		return new ResponseEntity<Job>(js.updateJob(Job),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Job>> getAllJob() throws JobException{
		return new ResponseEntity<List<Job>>(js.getAllJob(),HttpStatus.ACCEPTED);
	}

}
