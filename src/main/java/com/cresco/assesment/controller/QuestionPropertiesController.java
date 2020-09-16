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
import com.cresco.assesment.model.QuestionProperties;
import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.model.models.Question;
import com.cresco.assesment.service.QuestionProertiesImpl;

@RestController
@CrossOrigin
public class QuestionPropertiesController {
@Autowired
QuestionProertiesImpl properties;
@RequestMapping(value="/QuestionProperty",method=RequestMethod.GET)
public ResponseEntity<List<QuestionProperties>> getallproperties()
{
	List<QuestionProperties> model=properties.getAllQuestionProp();
	return new ResponseEntity<List<QuestionProperties>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/QuestionProperty/{AssesmentId}/{Sections}",method=RequestMethod.GET)
public ResponseEntity<List<QuestionProperties>> getproperty(@PathVariable("AssesmentId") Long id,@PathVariable("Sections") Long Section)
{
	
	List<QuestionProperties> model=properties.getQuestionByNumber(id,Section);
	return new ResponseEntity<List<QuestionProperties>>(model,new HttpHeaders(), HttpStatus.OK);
}
/*@RequestMapping(value="/QuestionProperty",method=RequestMethod.POST)
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody QuestionProperties model)
{
	QuestionProperties updated=properties.createOrUpdateQuestionProp(model);
	return new ResponseEntity<Long>(updated.getQuestion_id(),new HttpHeaders(),HttpStatus.OK);
}*/
@RequestMapping(value="/QuestionProperty/{Question}",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@PathVariable("Question") Long Question)
{
	
	properties.deleteByQuestionNo(Question);
	return HttpStatus.ACCEPTED;
}

@RequestMapping(value="/QuestionProperty/{QuestionId}",method=RequestMethod.PUT)
public ResponseEntity<Long> createOrUpdateoptions(@RequestBody Question model,@PathVariable("QuestionId") Long id)
{
	QuestionProperties model1=new QuestionProperties();
	model1.setAnswer_type(model.getAnswer_type());
	model1.setLogic_jump(model.getLogic_jump());
	model1.setNo_of_options(model.getNo_of_options());
	model1.setOptions(model.getOptions());
	model1.setQuestion_id(id);
	model1.setQuestion_no(model.getQuestion_no());
	model1.setQuestion_q(model.getQuestion_q());
	model1.setQuestion_type(model.getQuestion_type());
	model1.setScore(model.getScore());
	model1.setTimer(model.getTimer());
	AssesmentProperties ap=new AssesmentProperties();
	ap.setAssessment_id(model.getAssessment_id());
	SectionProperties sp=new SectionProperties();
	sp.setSection_id(model.getSection_id());
	model1.setForeign_key1(ap);
	model1.setForeign_key2(sp);
	QuestionProperties updated=properties.createOrUpdateQuestionProp(model1);
	return new ResponseEntity<Long>(updated.getQuestion_id(),new HttpHeaders(),HttpStatus.OK);
}
}
