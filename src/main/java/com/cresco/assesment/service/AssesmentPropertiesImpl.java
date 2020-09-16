package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.repository.AssesmentPropertyRepo;
import com.cresco.assesment.repository.GetAllrepo;

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
public AssesmentProperties getAssesmentById(Long AssessmentId) {
	Optional<AssesmentProperties> properties=repo.findById(AssessmentId);
	
	// TODO Auto-generated method stub
	return properties.get();
}

@Override
public AssesmentProperties createOrUpdateAssesment(AssesmentProperties properties) {
	// TODO Auto-generated method stub
	/*Optional<AssesmentProperties> property=repo.findById(properties.getAssessmentId());
	if(property.isPresent())
	{
		AssesmentProperties model=property.get();
		model.setAssessmentName(properties.getAssessmentName());
		model.setAssessmentLevel(properties.getAssessmentLevel());
		model.setAssessmentId(properties.getAssessmentId());
		model.setSpecialization(properties.getSpecialization());
		model.setNoOfSections(properties.getNoOfSections());
		model.setTime(properties.getTime());
		model=repo.save(model);
		return model;
	}
	else
	{
		AssesmentProperties model=repo.save(properties);
		return model;
	}*/
	AssesmentProperties model=repo.save(properties);
	return model;
	
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
public Long getAssessmentid(String AssessmentName) {
	// TODO Auto-generated method stub
	Long id=repo.getidbyname(AssessmentName);
	return id;
}


}
