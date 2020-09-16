package com.cresco.assesment.model.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
@Entity
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass =JsonBinaryType.class)
    		
})
@Table(name="AllAssessment")
public class Assessment {
	@Id
	private Long assessment_id;
	private String assessment_name;
	private String assessment_level;
	private String Specialization;
	private int time;
	private String keywords;
	private String role;
	private int No_of_sections;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private List<ASection> sections;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private List<Aquestions> questions;
	public Long getAssessment_id() {
		return assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		this.assessment_id = assessment_id;
	}
	public String getAssessment_name() {
		return assessment_name;
	}
	public void setAssessment_name(String assessment_name) {
		this.assessment_name = assessment_name;
	}
	public String getAssessment_level() {
		return assessment_level;
	}
	public void setAssessment_level(String assessment_level) {
		this.assessment_level = assessment_level;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getNo_of_sections() {
		return No_of_sections;
	}
	public void setNo_of_sections(int no_of_sections) {
		No_of_sections = no_of_sections;
	}
	public List<ASection> getSections() {
		return sections;
	}
	public void setSections(List<ASection> sections) {
		this.sections = sections;
	}
	public List<Aquestions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Aquestions> questions) {
		this.questions = questions;
	}
	
	
}
