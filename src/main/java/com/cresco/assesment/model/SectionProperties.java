package com.cresco.assesment.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="section")
public class SectionProperties {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long section_id;
	@Column( columnDefinition = "bigint default 0")
	private Long section_no;
	@ManyToOne
	@JoinColumn(name="assessment_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AssesmentProperties foreign_key;
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
	public AssesmentProperties getForeign_key() {
		return foreign_key;
	}
	public void setForeign_key(AssesmentProperties foreign_key) {
		this.foreign_key = foreign_key;
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
