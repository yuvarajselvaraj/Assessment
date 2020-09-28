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

import com.cresco.assesment.model.QuestionProperties;
import com.cresco.assesment.service.QuestionProertiesImpl;
import com.cresco.assesment.vo.Question;

@RestController
@CrossOrigin
public class QuestionPropertiesController {
@Autowired
QuestionProertiesImpl properties;
@RequestMapping(value="/QuestionProperty",method=RequestMethod.GET)
public ResponseEntity<List<QuestionProperties>> getallproperties(@RequestParam(required = false) Long assessment_id,@RequestParam(required = false) Long section_id)
{
	if(assessment_id==null && section_id==null)
	{
		List<QuestionProperties> model=properties.getAllQuestionProp();
		return new ResponseEntity<List<QuestionProperties>>(model,new HttpHeaders(),HttpStatus.OK);
	}
	else
	{
		List<QuestionProperties> model=properties.getQuestionByNumber(assessment_id,section_id);
		return new ResponseEntity<List<QuestionProperties>>(model,new HttpHeaders(), HttpStatus.OK);
	}
	
}
@RequestMapping(value="/QuestionProperty",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@RequestParam (required=true) Long id)
{
	
	properties.deleteByQuestionNo(id);
	return HttpStatus.ACCEPTED;
}

@RequestMapping(value="/QuestionProperty",method=RequestMethod.PUT)
public HttpStatus createOrUpdateoptions(@RequestBody Question model)
{
	
	properties.UpdateQuestionProp(model);
	return HttpStatus.ACCEPTED;
}
}
