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

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.service.SectionPropertiesImpl;
import com.cresco.assesment.vo.Section;

@RestController
@CrossOrigin
public class SectionPropertiesController {
@Autowired
SectionPropertiesImpl properties;
@RequestMapping(value="/SectionProperty",method=RequestMethod.GET)
public ResponseEntity<List<SectionProperties>> getallsections(@RequestParam (required=false) Long id)
{
	List<SectionProperties> model;
	if(id==null)
	{
		model=properties.getAllSections();
		
	}
	else
	{
		model=properties.getSectionsByname(id);
		
	}
	return new ResponseEntity<List<SectionProperties>>(model,new HttpHeaders(),HttpStatus.OK);
	
}
@RequestMapping(value="/SectionProperty",method=RequestMethod.POST)
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody Section model)
{
	
	SectionProperties updated=properties.createSections(model);
	return new ResponseEntity<Long>(updated.getSection_id(),new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/SectionProperty",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@RequestParam (required=true) Long id)
{

	
	properties.deleteBySectionAndName(id);
	return HttpStatus.ACCEPTED;
}
@RequestMapping(value="/SectionProperty",method=RequestMethod.PUT)
public HttpStatus Updateoptions(@RequestBody Section model)
{
	
	properties.updateSections(model);
	return HttpStatus.ACCEPTED;
}
}
