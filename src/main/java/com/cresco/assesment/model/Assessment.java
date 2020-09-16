package com.cresco.assesment.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.cresco.assesment.json.Optionjson;
import com.cresco.assesment.json.QOptions;
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
	private String assessment_specialization;
	private int assessment_time;
	private String assessment_keywords;
	private String assessment_role;
	private int assessment_noofsections;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private List<ASection> sections;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private List<Aquestions> questions;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private Optionjson Accessbility;
	private int accessbility_negativemark;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private Optionjson display_objectjson;
	private String internet_issue;
	private String server_issue;
	private String webcam_issue;
	private String proctor_alert;
	private String mic_issue;
	private String Shortcut;
	private int shortcut_noofoptions;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private QOptions shortcut_options;
	private String modes;
	private int Themes;
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
	public int getAssessment_time() {
		return assessment_time;
	}
	public void setAssessment_time(int assessment_time) {
		this.assessment_time = assessment_time;
	}
	public String getAssessment_keywords() {
		return assessment_keywords;
	}
	public void setAssessment_keywords(String assessment_keywords) {
		this.assessment_keywords = assessment_keywords;
	}
	public String getAssessment_role() {
		return assessment_role;
	}
	public void setAssessment_role(String assessment_role) {
		this.assessment_role = assessment_role;
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
	public Optionjson getAccessbility() {
		return Accessbility;
	}
	public void setAccessbility(Optionjson accessbility) {
		Accessbility = accessbility;
	}
	public int getAccessbility_negativemark() {
		return accessbility_negativemark;
	}
	public void setAccessbility_negativemark(int accessbility_negativemark) {
		this.accessbility_negativemark = accessbility_negativemark;
	}
	public Optionjson getDisplay_objectjson() {
		return display_objectjson;
	}
	public void setDisplay_objectjson(Optionjson display_objectjson) {
		this.display_objectjson = display_objectjson;
	}
	public String getInternet_issue() {
		return internet_issue;
	}
	public void setInternet_issue(String internet_issue) {
		this.internet_issue = internet_issue;
	}
	public String getServer_issue() {
		return server_issue;
	}
	public void setServer_issue(String server_issue) {
		this.server_issue = server_issue;
	}
	public String getWebcam_issue() {
		return webcam_issue;
	}
	public void setWebcam_issue(String webcam_issue) {
		this.webcam_issue = webcam_issue;
	}
	public String getProctor_alert() {
		return proctor_alert;
	}
	public void setProctor_alert(String proctor_alert) {
		this.proctor_alert = proctor_alert;
	}
	public String getMic_issue() {
		return mic_issue;
	}
	public void setMic_issue(String mic_issue) {
		this.mic_issue = mic_issue;
	}
	public String getShortcut() {
		return Shortcut;
	}
	public void setShortcut(String shortcut) {
		Shortcut = shortcut;
	}
	public int getShortcut_noofoptions() {
		return shortcut_noofoptions;
	}
	public void setShortcut_noofoptions(int shortcut_noofoptions) {
		this.shortcut_noofoptions = shortcut_noofoptions;
	}
	public QOptions getShortcut_options() {
		return shortcut_options;
	}
	public void setShortcut_options(QOptions shortcut_options) {
		this.shortcut_options = shortcut_options;
	}
	public String getModes() {
		return modes;
	}
	public void setModes(String modes) {
		this.modes = modes;
	}
	public int getThemes() {
		return Themes;
	}
	public void setThemes(int themes) {
		Themes = themes;
	}
	
	public int getAssessment_noofsections() {
		return assessment_noofsections;
	}
	public void setAssessment_noofsections(int assessment_noofsections) {
		this.assessment_noofsections = assessment_noofsections;
	}
	public String getAssessment_specialization() {
		return assessment_specialization;
	}
	public void setAssessment_specialization(String assessment_specialization) {
		this.assessment_specialization = assessment_specialization;
	}
	
}
