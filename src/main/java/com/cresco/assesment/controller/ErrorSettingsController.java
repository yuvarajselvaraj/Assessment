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

import com.cresco.assesment.model.ErrorSettings;
import com.cresco.assesment.model.models.Error;
import com.cresco.assesment.service.ErrorSettingsImpl;
@RestController
@CrossOrigin
public class ErrorSettingsController {
@Autowired 
ErrorSettingsImpl service;
@RequestMapping(value="/ErrorSettings",method=RequestMethod.GET)
public ResponseEntity<List<ErrorSettings>> getalloptions(@RequestParam(required = false) Long id)
{
	if(id==null)
	{
		List<ErrorSettings> model=service.getallSettings();
		return new ResponseEntity<List<ErrorSettings>>(model,new HttpHeaders(),HttpStatus.OK);
	}
	else
	{
		List<ErrorSettings> model=new ArrayList<ErrorSettings>();
		model.add(service.getSettingsByName(id));
		return new ResponseEntity<List<ErrorSettings>>(model,new HttpHeaders(),HttpStatus.OK);
	}
	
}
@RequestMapping(value="/ErrorSettings",method=RequestMethod.POST)
public ResponseEntity<ErrorSettings> createOrUpdatethemes(@RequestBody Error model)
{
	
	ErrorSettings updated=service.createOrUpdateSettings(model);
	return new ResponseEntity<ErrorSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ErrorSettings",method=RequestMethod.PUT)
public ResponseEntity<ErrorSettings> Updatethemes(@RequestBody Error model)
{
	
	ErrorSettings updated=service.createOrUpdateSettings(model);
	return new ResponseEntity<ErrorSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
