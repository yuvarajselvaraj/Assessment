package com.cresco.assesment.model.models;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

import com.cresco.assesment.json.QOptions;

public class Shortcut {
	private String Shortcut;
	private int no_of_options;
	private QOptions options;
	private Long assessment_id;
	public String getShortcut() {
		return Shortcut;
	}
	public void setShortcut(String shortcut) {
		Shortcut = shortcut;
	}
	public int getNo_of_options() {
		return no_of_options;
	}
	public void setNo_of_options(int no_of_options) {
		this.no_of_options = no_of_options;
	}
	public QOptions getOptions() {
		return options;
	}
	public void setOptions(QOptions options) {
		this.options = options;
	}
	public Long getAssessment_id() {
		return assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		this.assessment_id = assessment_id;
	}
	
}
