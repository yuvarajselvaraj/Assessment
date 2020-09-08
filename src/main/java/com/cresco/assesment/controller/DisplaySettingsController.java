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
@PostMapping(value="/options")
public ResponseEntity<DisplaySettings> createOrUpdateoptions(@RequestBody DisplaySettings model)
{
	DisplaySettings updated=display.createOrUpdateoptions(model);
	return new ResponseEntity<DisplaySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
