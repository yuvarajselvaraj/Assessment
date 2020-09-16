package com.cresco.assesment.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.assesment.model.GetAll;
import com.cresco.assesment.model.models.Assessment;
import com.cresco.assesment.service.GetAllImpl;

@RestController
public class AlltableViewController {
	@Autowired
	GetAllImpl properties;
	@RequestMapping(value="/Getall",method=RequestMethod.GET)
	public ResponseEntity<List<GetAll>> getalloptions()
	{
		
		List<GetAll> model=properties.getalldetails();
		return new ResponseEntity<List<GetAll>>(model,new HttpHeaders(),HttpStatus.OK);
	}
	@RequestMapping(value="/Getall/{AssessmentId}",method=RequestMethod.GET)
	public ResponseEntity<Assessment> getoptions(@PathVariable("AssessmentId") Long id) throws Exception
	{
		Assessment model=properties.getbyid(id);
		return new ResponseEntity<Assessment>(model,new HttpHeaders(),HttpStatus.OK);
	}
	
}
