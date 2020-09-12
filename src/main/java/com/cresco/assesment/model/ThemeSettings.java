package com.cresco.assesment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ThemeSettings")
public class ThemeSettings {
	@Id
	private PrimaryKey primaryKey;
	private String modes;
	private int Themes;
	
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(PrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
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
