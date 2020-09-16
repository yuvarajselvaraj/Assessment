package com.cresco.assesment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.cresco.assesment.json.Logic;
import com.cresco.assesment.json.Optionjson;
import com.cresco.assesment.json.QOptions;
import com.cresco.assesment.json.Score;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
@Entity
@Table(name="allview")
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass =JsonBinaryType.class)
    		
})
public class GetAll {
	@Id
	@Column(nullable=true)
private Long assessment_id;
private String assessment_noofsections;
private String assessment_specialization;
private String assessment_level;
private String assessment_name;
private String assessment_keywords;
private String assessment_role;
private String assessment_time;

private String section_id;

private String section_noofquestions;

private String section_no;
private String section_type;

private String section_time;
//@Column(nullable=true)
private String section_weightage;
//@Column(nullable=true)
private String question_id;
private String question_answertype;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private Logic question_logicjump;
//@Column(nullable=true)
private String question_noofoptions;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private QOptions question_options;
//@Column(nullable=true)
private String question_no;
private String question_type;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private Score question_score;
//@Column(nullable=true)
private String question_timer;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private Optionjson accessbility;
//@Column(nullable=true)
private String accessbility_negativemark;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private Optionjson display_objectjson;
private String internet_issue;
private String mic_issue;
private String proctor_alert;
private String server_issue;
private String webcam_issue;
private String shortcut;
private String shortcut_noofoptions;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private QOptions shortcut_options;
//@Column(nullable=true)
private String themes;
private String modes;
public Long getAssessment_id() {
	return assessment_id;
}
public void setAssessment_id(Long assessment_id) {
	this.assessment_id = assessment_id;
}
public String getAssessment_noofsections() {
	return assessment_noofsections;
}
public void setAssessment_noofsections(String assessment_noofsections) {
	this.assessment_noofsections = assessment_noofsections;
}
public String getAssessment_specialization() {
	return assessment_specialization;
}
public void setAssessment_specialization(String assessment_specialization) {
	this.assessment_specialization = assessment_specialization;
}
public String getAssessment_level() {
	return assessment_level;
}
public void setAssessment_level(String assessment_level) {
	this.assessment_level = assessment_level;
}
public String getAssessment_name() {
	return assessment_name;
}
public void setAssessment_name(String assessment_name) {
	this.assessment_name = assessment_name;
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
public String getAssessment_time() {
	return assessment_time;
}
public void setAssessment_time(String assessment_time) {
	this.assessment_time = assessment_time;
}
public String getSection_id() {
	return section_id;
}
public void setSection_id(String section_id) {
	this.section_id = section_id;
}
public String getSection_noofquestions() {
	return section_noofquestions;
}
public void setSection_noofquestions(String section_noofquestions) {
	this.section_noofquestions = section_noofquestions;
}
public String getSection_no() {
	return section_no;
}
public void setSection_no(String section_no) {
	this.section_no = section_no;
}
public String getSection_type() {
	return section_type;
}
public void setSection_type(String section_type) {
	this.section_type = section_type;
}
public String getSection_time() {
	return section_time;
}
public void setSection_time(String section_time) {
	this.section_time = section_time;
}
public String getSection_weightage() {
	return section_weightage;
}
public void setSection_weightage(String section_weightage) {
	this.section_weightage = section_weightage;
}
public String getQuestion_id() {
	return question_id;
}
public void setQuestion_id(String question_id) {
	this.question_id = question_id;
}
public String getQuestion_answertype() {
	return question_answertype;
}
public void setQuestion_answertype(String question_answertype) {
	this.question_answertype = question_answertype;
}
public Logic getQuestion_logicjump() {
	return question_logicjump;
}
public void setQuestion_logicjump(Logic question_logicjump) {
	this.question_logicjump = question_logicjump;
}
public String getQuestion_noofoptions() {
	return question_noofoptions;
}
public void setQuestion_noofoptions(String question_noofoptions) {
	this.question_noofoptions = question_noofoptions;
}
public QOptions getQuestion_options() {
	return question_options;
}
public void setQuestion_options(QOptions question_options) {
	this.question_options = question_options;
}
public String getQuestion_no() {
	return question_no;
}
public void setQuestion_no(String question_no) {
	this.question_no = question_no;
}
public String getQuestion_type() {
	return question_type;
}
public void setQuestion_type(String question_type) {
	this.question_type = question_type;
}
public Score getQuestion_score() {
	return question_score;
}
public void setQuestion_score(Score question_score) {
	this.question_score = question_score;
}
public String getQuestion_timer() {
	return question_timer;
}
public void setQuestion_timer(String question_timer) {
	this.question_timer = question_timer;
}
public Optionjson getAccessbility() {
	return accessbility;
}
public void setAccessbility(Optionjson accessbility) {
	this.accessbility = accessbility;
}
public String getAccessbility_negativemark() {
	return accessbility_negativemark;
}
public void setAccessbility_negativemark(String accessbility_negativemark) {
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
public String getMic_issue() {
	return mic_issue;
}
public void setMic_issue(String mic_issue) {
	this.mic_issue = mic_issue;
}
public String getProctor_alert() {
	return proctor_alert;
}
public void setProctor_alert(String proctor_alert) {
	this.proctor_alert = proctor_alert;
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
public String getShortcut() {
	return shortcut;
}
public void setShortcut(String shortcut) {
	this.shortcut = shortcut;
}
public String getShortcut_noofoptions() {
	return shortcut_noofoptions;
}
public void setShortcut_noofoptions(String shortcut_noofoptions) {
	this.shortcut_noofoptions = shortcut_noofoptions;
}
public QOptions getShortcut_options() {
	return shortcut_options;
}
public void setShortcut_options(QOptions shortcut_options) {
	this.shortcut_options = shortcut_options;
}
public String getThemes() {
	return themes;
}
public void setThemes(String themes) {
	this.themes = themes;
}
public String getModes() {
	return modes;
}
public void setModes(String modes) {
	this.modes = modes;
}

}
