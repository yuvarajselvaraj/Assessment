package com.cresco.assesment.controller;

import java.util.ArrayList;
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
public ResponseEntity<List<DisplaySettings>> getalloptions(@RequestParam(required = false) Long id)
{
	if(id==null)
	{
		List<DisplaySettings> model=display.getAlloptions();
		return new ResponseEntity<List<DisplaySettings>>(model,new HttpHeaders(), HttpStatus.OK);
	}
	else
	{
		List<DisplaySettings> model=new ArrayList<DisplaySettings>();
		model.add(display.getOptionsByaname(id));
		return new ResponseEntity<List<DisplaySettings>>(model,new HttpHeaders(), HttpStatus.OK);
	}
	
}
@RequestMapping(value="/options",method=RequestMethod.POST)
public ResponseEntity<DisplaySettings> createOrUpdateoptions(@RequestBody Display model)
{	
	DisplaySettings updated=display.createOrUpdateoptions(model);
	return new ResponseEntity<DisplaySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/options",method=RequestMethod.PUT)
public ResponseEntity<DisplaySettings> Updateoptions(@RequestBody Display model)
{	
	DisplaySettings updated=display.createOrUpdateoptions(model);
	return new ResponseEntity<DisplaySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
