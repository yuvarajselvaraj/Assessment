package com.cresco.assesment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.Assessment;
import com.cresco.assesment.repository.AssesmentPropertyRepo;
import com.cresco.assesment.repository.GetAllrepo;
@Service
public class GetAllImpl implements GetAllService {
	@Autowired
	GetAllrepo repo;
	@Autowired
	AssesmentPropertyRepo repo1;
	
	@Override
	public Assessment getbyid(Long id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Assessment> assessment=repo.getbyid(id);
		return assessment.get();
	}
}
