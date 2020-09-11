package com.cresco.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.GetAll;
import com.cresco.assesment.service.AssesmentPropertiesImpl;

@RestController
public class AlltableViewController {
	@Autowired
	AssesmentPropertiesImpl properties;
	@RequestMapping(value="/Getall",method=RequestMethod.GET)
	public ResponseEntity<List<GetAll>> getalloptions()
	{
		
		List<GetAll> model=properties.getalldetails();
		return new ResponseEntity<List<GetAll>>(model,new HttpHeaders(),HttpStatus.OK);
	}
}
