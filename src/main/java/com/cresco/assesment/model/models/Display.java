package com.cresco.assesment.model.models;

import com.cresco.assesment.json.Optionjson;

public class Display {
	private Optionjson ajson;
	private Long assessment_id;
	public Optionjson getAjson() {
		return ajson;
	}
	public void setAjson(Optionjson ajson) {
		this.ajson = ajson;
	}
	public Long getAssessment_id() {
		return assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		this.assessment_id = assessment_id;
	}
	
}
