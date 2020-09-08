package com.cresco.assesment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.cresco.assesment.json.Logic;
import com.cresco.assesment.json.QOptions;
import com.cresco.assesment.json.Score;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass =JsonBinaryType.class)
    		
})
@Table(name="QuestionProp")
public class QuestionProperties implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long question_id;
	private String question_type;
	private String answer_type;
	private int no_of_options;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private Score score;
	private int timer;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private Logic logic_jump;
	private String question_q;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private QOptions options;
	private Long question_no;
	@ManyToOne
	@JoinColumn(name="assessment_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AssesmentProperties foreign_key1;
	@ManyToOne
	@JoinColumn(name="section_id")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private SectionProperties foreign_key2;
	public Long getQuestion_id() {
		return question_id;
	}
	/*public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}*/
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
	public int getNo_of_options() {
		return no_of_options;
	}
	public void setNo_of_options(int no_of_options) {
		this.no_of_options = no_of_options;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public int getTimer() {
		return timer;
	}
	public void setTimer(int timer) {
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
	public AssesmentProperties getForeign_key1() {
		return foreign_key1;
	}
	public void setForeign_key1(AssesmentProperties foreign_key1) {
		this.foreign_key1 = foreign_key1;
	}
	public SectionProperties getForeign_key2() {
		return foreign_key2;
	}
	public void setForeign_key2(SectionProperties foreign_key2) {
		this.foreign_key2 = foreign_key2;
	}
	
}
