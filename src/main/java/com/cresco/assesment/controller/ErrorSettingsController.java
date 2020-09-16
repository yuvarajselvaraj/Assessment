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
import com.cresco.assesment.model.ErrorSettings;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.service.ErrorSettingsImpl;
import com.cresco.assesment.model.models.*;
import com.cresco.assesment.model.models.Error;
@RestController
@CrossOrigin
public class ErrorSettingsController {
@Autowired 
ErrorSettingsImpl service;
@RequestMapping(value="/ErrorSettings",method=RequestMethod.GET)
public ResponseEntity<List<ErrorSettings>> getalloptions()
{
	List<ErrorSettings> model=service.getallSettings();
	return new ResponseEntity<List<ErrorSettings>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ErrorSettings/{AssesmentId}",method=RequestMethod.GET)
public ResponseEntity<ErrorSettings> gettheme(@PathVariable("AssesmentId")Long id )
{	

	ErrorSettings model=service.getSettingsByName(id);
	return new ResponseEntity<ErrorSettings>(model,new HttpHeaders(),HttpStatus.OK);
	
}
@RequestMapping(value="/ErrorSettings",method=RequestMethod.POST)
public ResponseEntity<ErrorSettings> createOrUpdatethemes(@RequestBody Error model)
{
	ErrorSettings settings=new ErrorSettings();
	PrimaryKey key=new PrimaryKey();
	AssesmentProperties pro=new AssesmentProperties();
	pro.setAssessment_id(model.getAssessment_id());
	key.setAssessment(pro);
	settings.setPrimaryKey(key);
	settings.setInternet_issue(model.getInternet_issue());
	settings.setMic_issue(model.getMic_issue());
	settings.setProctor_alert(model.getProctor_alert());
	settings.setServer_issue(model.getServer_issue());
	settings.setWebcam_issue(model.getWebcam_issue());
	ErrorSettings updated=service.createOrUpdateSettings(settings);
	return new ResponseEntity<ErrorSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/ErrorSettings",method=RequestMethod.PUT)
public ResponseEntity<ErrorSettings> Updatethemes(@RequestBody Error model)
{
	ErrorSettings settings=new ErrorSettings();
	PrimaryKey key=new PrimaryKey();
	AssesmentProperties pro=new AssesmentProperties();
	pro.setAssessment_id(model.getAssessment_id());
	key.setAssessment(pro);
	settings.setPrimaryKey(key);
	settings.setInternet_issue(model.getInternet_issue());
	settings.setMic_issue(model.getMic_issue());
	settings.setProctor_alert(model.getProctor_alert());
	settings.setServer_issue(model.getServer_issue());
	settings.setWebcam_issue(model.getWebcam_issue());
	ErrorSettings updated=service.createOrUpdateSettings(settings);
	return new ResponseEntity<ErrorSettings>(updated,new HttpHeaders(),HttpStatus.OK);
}
}
