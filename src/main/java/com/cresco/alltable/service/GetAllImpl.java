package com.cresco.alltable.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.alltable.model.Assessment;
import com.cresco.alltable.repo.GetAllrepo;
@Service
public class GetAllImpl implements GetAllService {
	@Autowired
	GetAllrepo repo;
	
	@Override
	public List<Assessment> getbyid(Long id) throws Exception {
		// TODO Auto-generated method stub
		List<Assessment> model=new ArrayList<Assessment>();
		Optional<Assessment> assessment=repo.getbyid(id);
		model.add(assessment.get());
		return model;
	}
}
