package com.cresco.assesment.controller;

import java.util.List;

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
import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.model.models.Section;
import com.cresco.assesment.service.SectionPropertiesImpl;

@RestController
@CrossOrigin
public class SectionPropertiesController {
@Autowired
SectionPropertiesImpl properties;
@RequestMapping(value="/SectionProperty",method=RequestMethod.GET)
public ResponseEntity<List<SectionProperties>> getallsections()
{
	List<SectionProperties> model=properties.getAllSections();
	return new ResponseEntity<List<SectionProperties>>(model,new HttpHeaders(),HttpStatus.OK);
}
/*@RequestMapping(value="/SectionProperty/{AssessmentId}/{SectionId}",method=RequestMethod.GET)
public ResponseEntity<SectionProperties> getproperty(@PathVariable("AssessmentId") Long id,@PathVariable("SectionId") Long section)
{
	
	SectionProperties model=properties.getSectionsByname(id,section);
	return new ResponseEntity<SectionProperties>(model,new HttpHeaders(), HttpStatus.OK);
}*/
@RequestMapping(value="/SectionProperty/{AssessmentId}",method=RequestMethod.GET)
public ResponseEntity<List<SectionProperties>> getproperty(@PathVariable("AssessmentId") Long id)
{
	
	List<SectionProperties> model=properties.getSectionsByname(id);
	return new ResponseEntity<List<SectionProperties>>(model,new HttpHeaders(), HttpStatus.OK);
}
@RequestMapping(value="/SectionProperty",method=RequestMethod.POST)
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody Section model)
{
	SectionProperties model1=new SectionProperties();
	AssesmentProperties property=new AssesmentProperties();
	property.setAssessment_id(model.getAssessment_id());
model1.setForeign_key(property);
	model1.setSection_no(model.getSection_no());
	model1.setNo_of_questions(model.getNo_of_questions());
	model1.setSection_type(model.getSection_type());
	model1.setSection_no(model.getSection_no());
	model1.setTime(model.getTime());
	model1.setWeightage(model.getWeightage());
	SectionProperties updated=properties.createOrUpdateSections(model1);
	return new ResponseEntity<Long>(updated.getSection_id(),new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/SectionProperty/{SectionId}",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@PathVariable("SectionId") Long section)
{

	
	properties.deleteBySectionAndName(section);
	return HttpStatus.ACCEPTED;
}
@RequestMapping(value="/SectionProperty",method=RequestMethod.PUT)
public ResponseEntity<Long> Updateoptions(@RequestBody Section model)
{
	SectionProperties model1=new SectionProperties();
	AssesmentProperties property=new AssesmentProperties();
	property.setAssessment_id(model.getAssessment_id());
model1.setForeign_key(property);
	model1.setSection_no(model.getSection_no());
	model1.setSection_no(model.getSection_no());
	model1.setNo_of_questions(model.getNo_of_questions());
	model1.setSection_type(model.getSection_type());
	model1.setTime(model.getTime());
	model1.setWeightage(model.getWeightage());
	model1.setSection_id(model.getSection_id());
	SectionProperties updated=properties.createOrUpdateSections(model1);
	return new ResponseEntity<Long>(updated.getSection_id(),new HttpHeaders(),HttpStatus.OK);
}
}
