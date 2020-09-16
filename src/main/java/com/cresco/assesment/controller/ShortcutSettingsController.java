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
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.ShortcutSettings;
import com.cresco.assesment.model.models.Shortcut;
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
public ResponseEntity<ShortcutSettings> createOrUpdatethemes(@RequestBody Shortcut model)
{
	ShortcutSettings settings=new ShortcutSettings();
	PrimaryKey key=new PrimaryKey();
	AssesmentProperties pro=new AssesmentProperties();
	pro.setAssessment_id(model.getAssessment_id());
	key.setAssessment(pro);
	settings.setPrimaryKey(key);
	settings.setNo_of_options(model.getNo_of_options());
	settings.setOptions(model.getOptions());
	settings.setShortcut(model.getShortcut());
	ShortcutSettings updated=service.createOrUpdateSettings(settings);
	return new ResponseEntity<ShortcutSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ShortcutSettings",method=RequestMethod.PUT)
public ResponseEntity<ShortcutSettings> Updatethemes(@RequestBody Shortcut model)
{
	ShortcutSettings settings=new ShortcutSettings();
	PrimaryKey key=new PrimaryKey();
	AssesmentProperties pro=new AssesmentProperties();
	pro.setAssessment_id(model.getAssessment_id());
	key.setAssessment(pro);
	settings.setPrimaryKey(key);
	settings.setNo_of_options(model.getNo_of_options());
	settings.setOptions(model.getOptions());
	settings.setShortcut(model.getShortcut());
	ShortcutSettings updated=service.createOrUpdateSettings(settings);
	return new ResponseEntity<ShortcutSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
