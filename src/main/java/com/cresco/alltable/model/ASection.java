package com.cresco.alltable.model;

import java.io.Serializable;

import javax.persistence.Column;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
public class ASection implements Serializable{
	private Long section_id;
	private Long section_no;
	private String section_type;
	private int weightage;
	private int time;
	private int No_of_questions;
	private Long Assessment_id;
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
	public String getSection_type() {
		return section_type;
	}
	public void setSection_type(String section_type) {
		this.section_type = section_type;
	}
	public int getWeightage() {
		return weightage;
	}
	public void setWeightage(int weightage) {
		this.weightage = weightage;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getNo_of_questions() {
		return No_of_questions;
	}
	public void setNo_of_questions(int no_of_questions) {
		No_of_questions = no_of_questions;
	}
	public Long getAssessment_id() {
		return Assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		Assessment_id = assessment_id;
	}

}
