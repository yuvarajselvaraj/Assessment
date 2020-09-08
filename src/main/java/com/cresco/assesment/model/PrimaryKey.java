package com.cresco.assesment.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Embeddable
public class PrimaryKey implements Serializable {
	@OneToOne
	@JoinColumn(name="assessment_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AssesmentProperties assessment;

	public AssesmentProperties getAssessment() {
		return assessment;
	}

	public void setAssessment(AssesmentProperties assessment) {
		this.assessment = assessment;
	}
	
}
