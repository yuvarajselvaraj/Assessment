package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.Assessment;

public interface GetAllService {
	
	public List<Assessment> getbyid(Long id) throws Exception;
}
