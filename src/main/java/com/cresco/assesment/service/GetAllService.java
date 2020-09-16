package com.cresco.assesment.service;

import java.util.List;

import org.json.JSONObject;

import com.cresco.assesment.model.GetAll;
import com.cresco.assesment.model.models.Assessment;

public interface GetAllService {
	public List<GetAll> getalldetails();
	public Assessment getbyid(Long id) throws Exception;
}
