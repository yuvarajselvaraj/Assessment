package com.cresco.alltable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.alltable.model.Assessment;
import com.cresco.alltable.service.GetAllImpl;

@RestController
@CrossOrigin
public class AlltableViewController {
	@Autowired
	GetAllImpl properties;
	
	@RequestMapping(value="/Getall",method=RequestMethod.GET)
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<Assessment>> getoptions(@RequestParam(required = true) Long id) throws Exception
	{
		List<Assessment> model=properties.getbyid(id);
		return new ResponseEntity<List<Assessment>>(model,new HttpHeaders(),HttpStatus.OK);
	}
	
}
