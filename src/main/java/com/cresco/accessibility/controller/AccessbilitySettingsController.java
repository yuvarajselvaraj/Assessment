package com.cresco.accessibility.controller;

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

import com.cresco.accessibility.model.AccessbilitySettings;
import com.cresco.accessibility.service.AccessbilitySettingsImpl;
import com.cresco.accessibility.vo.Accessbility;

@RestController
@CrossOrigin
public class AccessbilitySettingsController {
@Autowired
AccessbilitySettingsImpl settings;
@RequestMapping(value="/AccessbilitySettings",method=RequestMethod.GET)
public ResponseEntity<List<AccessbilitySettings>> getalloptions(@RequestParam(required = false) Long id)
{
	List<AccessbilitySettings> model;
	if(id==null)
	{
		model=settings.getalloptions();
	}
	else
	{
		 model=settings.getOptionsByName(id);
	}
	return new ResponseEntity<List<AccessbilitySettings>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AccessbilitySettings",method=RequestMethod.POST)
public ResponseEntity<AccessbilitySettings> createOrUpdatethemes(@RequestBody Accessbility model)
{	
	AccessbilitySettings updated=settings.createOrUpdateoptions(model);
	return new ResponseEntity<AccessbilitySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AccessbilitySettings",method=RequestMethod.PUT)
public ResponseEntity<AccessbilitySettings> Updatethemes(@RequestBody Accessbility model)
{	
	AccessbilitySettings updated=settings.createOrUpdateoptions(model);
	return new ResponseEntity<AccessbilitySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
