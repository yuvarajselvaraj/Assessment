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

import com.cresco.assesment.model.ShortcutSettings;
import com.cresco.assesment.service.ShortcutSettingsImpl;

@RestController
@CrossOrigin
public class ShortcutSettingsController {
@Autowired 
ShortcutSettingsImpl service;
@RequestMapping(value="/ShortcutSettings",method=RequestMethod.GET)
public ResponseEntity<List<ShortcutSettings>> getallOptions()
{
	List<ShortcutSettings> model=service.getallSettings();
	return new ResponseEntity<List<ShortcutSettings>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ShortcutSettings/{AssesmentId}",method=RequestMethod.GET)
public ResponseEntity<List<ShortcutSettings> >gettheme(@PathVariable("AssesmentId")Long id )
{
	List<ShortcutSettings> model=service.getSettingsByName(id);
	return new ResponseEntity<List<ShortcutSettings>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ShortcutSettings",method=RequestMethod.POST)
public ResponseEntity<ShortcutSettings> createOrUpdatethemes(@RequestBody ShortcutSettings model)
{
	ShortcutSettings updated=service.createOrUpdateSettings(model);
	return new ResponseEntity<ShortcutSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
