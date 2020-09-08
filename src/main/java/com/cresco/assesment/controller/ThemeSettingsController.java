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

import com.cresco.assesment.model.ThemeSettings;
import com.cresco.assesment.service.ThemeSettingsImpl;

@RestController
@CrossOrigin
public class ThemeSettingsController {
@Autowired
ThemeSettingsImpl settings;
@RequestMapping(value="/ThemeSettings",method=RequestMethod.GET)
public ResponseEntity<List<ThemeSettings>> getalloptions()
{
	List<ThemeSettings> model=settings.getallSettings();
	return new ResponseEntity<List<ThemeSettings>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ThemeSettings/{AssesmentId}",method=RequestMethod.GET)
public ResponseEntity<List<ThemeSettings>> gettheme(@PathVariable("AssesmentId")Long id )
{
	List<ThemeSettings> model=settings.getSetingsByName(id);
	return new ResponseEntity<List<ThemeSettings>>(model,new HttpHeaders(),HttpStatus.OK);
	
}
@RequestMapping(value="/ThemeSettings",method=RequestMethod.POST)
public ResponseEntity<ThemeSettings> createOrUpdatethemes(@RequestBody ThemeSettings model)
{
	ThemeSettings updated=settings.createOrUpdateSettings(model);
	return new ResponseEntity<ThemeSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
