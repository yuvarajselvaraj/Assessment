package com.cresco.assesment.service;

import java.util.List;

import com.cresco.alltable.model.Assessment;
import com.cresco.assesment.model.AssesmentProperties;

public interface AssesmentPropertiesService {
public List<AssesmentProperties> getAllAssesment();
public List<AssesmentProperties> getAssesmentById(Long AssesssmentId);
public Long createOrUpdateAssesment(Assessment properties);
public void deleteById(Long AssessmentId);
public void UpdateAssesment(Assessment properties);

}
