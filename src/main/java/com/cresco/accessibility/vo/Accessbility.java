package com.cresco.accessibility.vo;

import com.cresco.assesment.json.Optionjson;

public class Accessbility {
	private Long assessment_id;
	private Optionjson Accessbility;
	private int negative_mark;
	public Long getAssessment_id() {
		return assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		this.assessment_id = assessment_id;
	}
	public Optionjson getAccessbility() {
		return Accessbility;
	}
	public void setAccessbility(Optionjson accessbility) {
		Accessbility = accessbility;
	}
	public int getNegative_mark() {
		return negative_mark;
	}
	public void setNegative_mark(int negative_mark) {
		this.negative_mark = negative_mark;
	}
	
}
