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

import com.cresco.assesment.model.SectionProperties;
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
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody SectionProperties model)
{
	SectionProperties updated=properties.createOrUpdateSections(model);
	return new ResponseEntity<Long>(updated.getSection_id(),new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/SectionProperty/{SectionId}",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@PathVariable("SectionId") Long section)
{

	
	properties.deleteBySectionAndName(section);
	return HttpStatus.ACCEPTED;
}
}
