package com.cresco.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.DisplaySettings;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.models.Display;
import com.cresco.assesment.service.DisplaySettingsImpl;

@RestController
@CrossOrigin
public class DisplaySettingsController {
@Autowired
DisplaySettingsImpl display;
@RequestMapping(value="/options",method=RequestMethod.GET)
public ResponseEntity<List<DisplaySettings>> getalloptions()
{
	List<DisplaySettings> model=display.getAlloptions();
	return new ResponseEntity<List<DisplaySettings>>(model,new HttpHeaders(), HttpStatus.OK);
}
@RequestMapping(value="/options/{AssessmentId}",method=RequestMethod.GET)
public ResponseEntity<DisplaySettings> getoption(@PathVariable("AssessmentId") Long id)
{
	
	DisplaySettings model=display.getOptionsByaname(id);
	return new ResponseEntity<DisplaySettings>(model,new HttpHeaders(), HttpStatus.OK);
}
@RequestMapping(value="/options",method=RequestMethod.POST)
public ResponseEntity<DisplaySettings> createOrUpdateoptions(@RequestBody Display model)
{	
	DisplaySettings settings=new DisplaySettings();
	PrimaryKey key=new PrimaryKey();
	AssesmentProperties pro=new AssesmentProperties();
	pro.setAssessment_id(model.getAssessment_id());
	key.setAssessment(pro);
	settings.setPrimarykey(key);
	settings.setAjson(model.getAjson());
	DisplaySettings updated=display.createOrUpdateoptions(settings);
	return new ResponseEntity<DisplaySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/options",method=RequestMethod.PUT)
public ResponseEntity<DisplaySettings> Updateoptions(@RequestBody Display model)
{	DisplaySettings settings=new DisplaySettings();
	PrimaryKey key=new PrimaryKey();
	AssesmentProperties pro=new AssesmentProperties();
	pro.setAssessment_id(model.getAssessment_id());
	key.setAssessment(pro);
	settings.setPrimarykey(key);
	DisplaySettings updated=display.createOrUpdateoptions(settings);
	return new ResponseEntity<DisplaySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
