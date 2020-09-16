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
import com.cresco.assesment.model.models.Assesment;
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
public ResponseEntity<List<Long>> createOrUpdateoptions(@RequestBody Assesment model)
{
	AssesmentProperties prop=new AssesmentProperties();
	prop.setAssessment_level(model.getAssessment_level());
	prop.setAssessment_name(model.getAssessment_name());
	prop.setKeywords(model.getKeywords());
	prop.setNo_of_sections(model.getNo_of_sections());
	prop.setRole(model.getRole());
	prop.setSpecialization(model.getRole());
	prop.setTime(model.getTime());
	AssesmentProperties updated=properties.createOrUpdateAssesment(prop);
	List<Long> n=new ArrayList<Long>();
	n.add(updated.getAssessment_id());
	n.add((long) updated.getNo_of_sections());
	return new ResponseEntity<List<Long>>(n,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty/{AssesmentId}",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@PathVariable("AssesmentId") Long id)
{
	properties.deleteById(id);
	return HttpStatus.ACCEPTED;
}
@RequestMapping(value="/AssesmentProperty/{AssessmentId}",method=RequestMethod.PUT)
public ResponseEntity<List<Long>> Updateoptions(@RequestBody AssesmentProperties model,@PathVariable("AssessmentId") Long id)
{
	model.setAssessment_id(id);
	AssesmentProperties updated=properties.createOrUpdateAssesment(model);
	List<Long> n=new ArrayList<Long>();
	n.add(updated.getAssessment_id());
	n.add((long) updated.getNo_of_sections());
	return new ResponseEntity<List<Long>>(n,new HttpHeaders(),HttpStatus.OK);
}
}
