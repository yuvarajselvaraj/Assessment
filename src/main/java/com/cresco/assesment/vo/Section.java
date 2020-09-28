package com.cresco.assesment.vo;

public class Section {
	private Long section_id;
	private Long section_no;
	private Long assessment_id;
	private String section_type;
	private Long weightage;
	private Long time;
	private Long No_of_questions;
	public Long getSection_id() {
		return section_id;
	}
	public void setSection_id(Long section_id) {
		this.section_id = section_id;
	}
	public Long getSection_no() {
		return section_no;
	}
	public void setSection_no(Long section_no) {
		this.section_no = section_no;
	}
	public Long getAssessment_id() {
		return assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		this.assessment_id = assessment_id;
	}
	public String getSection_type() {
		return section_type;
	}
	public void setSection_type(String section_type) {
		this.section_type = section_type;
	}
	public Long getWeightage() {
		return weightage;
	}
	public void setWeightage(Long weightage) {
		this.weightage = weightage;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public Long getNo_of_questions() {
		return No_of_questions;
	}
	public void setNo_of_questions(Long no_of_questions) {
		No_of_questions = no_of_questions;
	}
	
	
}
