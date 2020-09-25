package com.cresco.assesment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.alltable.model.Assessment;
import com.cresco.alltable.repo.GetAllrepo;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.repository.AssesmentPropertyRepo;

@Service
public class AssesmentPropertiesImpl  implements AssesmentPropertiesService{
@Autowired
AssesmentPropertyRepo repo;
@Autowired
GetAllrepo repo1;
@Override
public List<AssesmentProperties> getAllAssesment() {
	List<AssesmentProperties> properties=repo.findAll();
	// TODO Auto-generated method stub
	return properties;
}

@Override
public List<AssesmentProperties> getAssesmentById(Long AssessmentId) {
	Optional<AssesmentProperties> properties=repo.findById(AssessmentId);
	List<AssesmentProperties> model=new ArrayList<AssesmentProperties>();
	model.add(properties.get());
	// TODO Auto-generated method stub
	return  model;
}

@Override
public Long createOrUpdateAssesment(Assessment model) {
	// TODO Auto-generated method stub
	AssesmentProperties prop=new AssesmentProperties();
	prop.setAssessment_level(model.getAssessment_level());
	prop.setAssessment_name(model.getAssessment_name());
	prop.setKeywords(model.getKeywords());
	prop.setNo_of_sections(model.getNo_of_sections());
	prop.setRole(model.getRole());
	prop.setSpecialization(model.getRole());
	prop.setTime(model.getTime());
	AssesmentProperties model1=repo.save(prop);
	return model1.getAssessment_id();
	
	
}

@Override
public void deleteById(Long AssessmentId) {
	// TODO Auto-generated method stub
	Optional<AssesmentProperties> property=repo.findById(AssessmentId);
	if(property.isPresent())
	{
		repo.deleteById(AssessmentId);
		
	}
	
}


@Override
public void UpdateAssesment(Assessment model) 
{
	AssesmentProperties prop=new AssesmentProperties();
	prop.setAssessment_id(model.getAssessment_id());
	prop.setAssessment_level(model.getAssessment_level());
	prop.setAssessment_name(model.getAssessment_name());
	prop.setKeywords(model.getKeywords());
	prop.setNo_of_sections(model.getNo_of_sections());
	prop.setRole(model.getRole());
	prop.setSpecialization(model.getRole());
	prop.setTime(model.getTime());
	// TODO Auto-generated method stub
	repo.save(prop);
}


}
