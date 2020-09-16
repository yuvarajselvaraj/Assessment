package com.cresco.assesment.model.models;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

import com.cresco.assesment.json.Logic;
import com.cresco.assesment.json.QOptions;
import com.cresco.assesment.json.Score;

public class Question {
	private Long question_id;
	private String question_type;
	private String answer_type;
	private Long no_of_options;
	
	private Score score;
	private Long timer;
	
	private Logic logic_jump;
	private String question_q;

	private QOptions options;
	private Long question_no;
	private Long assessment_id;
	private Long section_id;
	public Long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
	public String getAnswer_type() {
		return answer_type;
	}
	public void setAnswer_type(String answer_type) {
		this.answer_type = answer_type;
	}
	public Long getNo_of_options() {
		return no_of_options;
	}
	public void setNo_of_options(Long no_of_options) {
		this.no_of_options = no_of_options;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public Long getTimer() {
		return timer;
	}
	public void setTimer(Long timer) {
		this.timer = timer;
	}
	public Logic getLogic_jump() {
		return logic_jump;
	}
	public void setLogic_jump(Logic logic_jump) {
		this.logic_jump = logic_jump;
	}
	public String getQuestion_q() {
		return question_q;
	}
	public void setQuestion_q(String question_q) {
		this.question_q = question_q;
	}
	public QOptions getOptions() {
		return options;
	}
	public void setOptions(QOptions options) {
		this.options = options;
	}
	public Long getQuestion_no() {
		return question_no;
	}
	public void setQuestion_no(Long question_no) {
		this.question_no = question_no;
	}
	public Long getAssessment_id() {
		return assessment_id;
	}
	public void setAssessment_id(Long assessment_id) {
		this.assessment_id = assessment_id;
	}
	public Long getSection_id() {
		return section_id;
	}
	public void setSection_id(Long section_id) {
		this.section_id = section_id;
	}
	
}
