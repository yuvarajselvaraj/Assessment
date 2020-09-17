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
	private String specialization;
	private int time;
	private String keywords;
	private String role;
	private int no_of_sections;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private List<ASection> sections;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private List<Aquestions> questions;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private Optionjson Accessbility;
	private int negative_mark;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private Optionjson objectjson;
	private String internet_issue;
	private String server_issue;
	private String webcam_issue;
	private String proctor_alert;
	private String mic_issue;
	private String Shortcut;
	private int no_of_options;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private QOptions options;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
		return no_of_sections;
	}
	public void setNo_of_sections(int no_of_sections) {
		this.no_of_sections = no_of_sections;
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
	public int getNegative_mark() {
		return negative_mark;
	}
	public void setNegative_mark(int negative_mark) {
		this.negative_mark = negative_mark;
	}
	public Optionjson getObjectjson() {
		return objectjson;
	}
	public void setObjectjson(Optionjson objectjson) {
		this.objectjson = objectjson;
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
	
}
