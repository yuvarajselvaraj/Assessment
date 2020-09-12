package com.cresco.assesment.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.service.AssesmentPropertiesImpl;

@RestController
@CrossOrigin
public class AssesmentPropertiesController {
	@Autowired
	AssesmentPropertiesImpl properties;

@RequestMapping(value="/AssesmentProperty",method=RequestMethod.GET)
public ResponseEntity<List<AssesmentProperties>> getalloptions()
{
	
	List<AssesmentProperties> model=properties.getAllAssesment();
	return new ResponseEntity<List<AssesmentProperties>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty/{AssesmentId}",method=RequestMethod.GET)
public ResponseEntity<AssesmentProperties> getproperty(@PathVariable("AssesmentId") Long id)
{
	AssesmentProperties model=properties.getAssesmentById(id);
	return new ResponseEntity<AssesmentProperties>(model,new HttpHeaders(), HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty",method=RequestMethod.POST)
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody AssesmentProperties model)
{
	AssesmentProperties updated=properties.createOrUpdateAssesment(model);
	return new ResponseEntity<Long>(updated.getAssessment_id(),new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty/{AssesmentId}",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@PathVariable("AssesmentId") Long id)
{
	properties.deleteById(id);
	return HttpStatus.ACCEPTED;
}
@RequestMapping(value="/Assesment/{AssesmentName}",method=RequestMethod.GET)
public ResponseEntity<Long> getproperty(@PathVariable("AssesmentName")String AssessmentName)
{
	Long model=properties.getAssessmentid(AssessmentName);
	return new ResponseEntity<Long>(model,new HttpHeaders(), HttpStatus.OK);
}
}
