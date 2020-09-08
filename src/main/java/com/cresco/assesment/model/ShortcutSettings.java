package com.cresco.assesment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.cresco.assesment.json.QOptions;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass =JsonBinaryType.class)
    		
})
@Table(name="ShortcutSettings")
public class ShortcutSettings implements Serializable{
	@Id
	private PrimaryKey primaryKey;
	private String Shortcut;
	private int no_of_options;
	@Type(type = "jsonb")
	@Column(columnDefinition="json")
	private QOptions options;
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(PrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
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
	
	
}
