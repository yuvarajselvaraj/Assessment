package com.cresco.alltable.service;

import java.util.List;

import com.cresco.alltable.model.Assessment;

public interface GetAllService {
	
	public List<Assessment> getbyid(Long id) throws Exception;
}
