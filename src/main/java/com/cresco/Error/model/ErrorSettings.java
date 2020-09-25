package com.cresco.Error.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cresco.assesment.model.PrimaryKey;

@Entity
@Table(name="ErrorSettings")
public class ErrorSettings {
	@Id
	private PrimaryKey primaryKey;
	private String internet_issue;
	private String server_issue;
	private String webcam_issue;
	private String proctor_alert;
	private String mic_issue;
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(PrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
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
	
}
