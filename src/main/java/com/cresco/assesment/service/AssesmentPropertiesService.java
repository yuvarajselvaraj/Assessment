package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.GetAll;

public interface AssesmentPropertiesService {
public List<AssesmentProperties> getAllAssesment();
public AssesmentProperties getAssesmentById(Long AssesssmentId);
public AssesmentProperties createOrUpdateAssesment(AssesmentProperties properties);
public void deleteById(Long AssessmentId);
public List<GetAll> getalldetails();
public Long getAssessmentid(String AssessmentName);
}
