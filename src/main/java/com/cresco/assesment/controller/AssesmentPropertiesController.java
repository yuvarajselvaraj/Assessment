package com.cresco.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.alltable.model.Assessment;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.service.AssesmentPropertiesImpl;

@RestController
@CrossOrigin
public class AssesmentPropertiesController {
	@Autowired
	AssesmentPropertiesImpl properties;

@RequestMapping(value="/AssesmentProperty",method=RequestMethod.GET)
public ResponseEntity<List<AssesmentProperties>> getalloptions(@RequestParam(required = false) Long id)
{
	List<AssesmentProperties> model;
	if(id==null)
	{
		model=properties.getAllAssesment();
	}
	else
	{
		model=properties.getAssesmentById(id);
	}
	return new ResponseEntity<List<AssesmentProperties>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty",method=RequestMethod.POST)
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody Assessment model)
{
	
	Long n=properties.createOrUpdateAssesment(model);
	return new ResponseEntity<Long>(n,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@RequestParam(required = true) Long id)
{
	properties.deleteById(id);
	return HttpStatus.ACCEPTED;
}
@RequestMapping(value="/AssesmentProperty",method=RequestMethod.PUT)
public HttpStatus Updateoptions(@RequestBody Assessment model)
{
	
	properties.UpdateAssesment(model);
	return HttpStatus.ACCEPTED;
}
}
