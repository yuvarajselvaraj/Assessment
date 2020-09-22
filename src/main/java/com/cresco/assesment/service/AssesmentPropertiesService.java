package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.Assessment;

public interface AssesmentPropertiesService {
public List<AssesmentProperties> getAllAssesment();
public List<AssesmentProperties> getAssesmentById(Long AssesssmentId);
public Long createOrUpdateAssesment(Assessment properties);
public void deleteById(Long AssessmentId);
public void UpdateAssesment(Assessment properties);

}
