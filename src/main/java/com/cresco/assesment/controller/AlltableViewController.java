package com.cresco.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.assesment.model.Assessment;
import com.cresco.assesment.service.GetAllImpl;

@RestController
@CrossOrigin
public class AlltableViewController {
	@Autowired
	GetAllImpl properties;
	
	@RequestMapping(value="/Getall/{AssessmentId}",method=RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Assessment> getoptions(@PathVariable("AssessmentId") Long id) throws Exception
	{
		Assessment model=properties.getbyid(id);
		return new ResponseEntity<Assessment>(model,new HttpHeaders(),HttpStatus.OK);
	}
	
}
