package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.GetAll;
import com.cresco.assesment.model.models.Assessment;
import com.cresco.assesment.repository.AssesmentPropertyRepo;
import com.cresco.assesment.repository.GetAllrepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class GetAllImpl implements GetAllService {
	@Autowired
	GetAllrepo repo;
	@Autowired
	AssesmentPropertyRepo repo1;
	@Override
	public List<GetAll> getalldetails() {
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public Assessment getbyid(Long id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Assessment> assessment=repo.getbyid(id);
		return assessment.get();
	}
}
