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

import com.cresco.assesment.model.AccessbilitySettings;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.service.AccessbilitySettingsImpl;

@RestController
@CrossOrigin
public class AccessbilitySettingsController {
@Autowired
AccessbilitySettingsImpl settings;
@RequestMapping(value="/AccessbilitySettings",method=RequestMethod.GET)
public ResponseEntity<List<AccessbilitySettings>> getalloptions()
{
	List<AccessbilitySettings> model=settings.getalloptions();
	return new ResponseEntity<List<AccessbilitySettings>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AccessbilitySettings/{AssesmentId}",method=RequestMethod.GET)
public ResponseEntity<AccessbilitySettings> gettheme(@PathVariable("AssesmentId")Long id )
{
	AccessbilitySettings model=settings.getOptionsByName(id);
	return new ResponseEntity<AccessbilitySettings>(model,new HttpHeaders(),HttpStatus.OK);
	
}
@RequestMapping(value="/AccessbilitySettings",method=RequestMethod.POST)
public ResponseEntity<AccessbilitySettings> createOrUpdatethemes(@RequestBody AccessbilitySettings model)
{
	AccessbilitySettings updated=settings.createOrUpdateoptions(model);
	return new ResponseEntity<AccessbilitySettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
