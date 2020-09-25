package com.cresco.accessibility.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.cresco.assesment.json.Optionjson;
import com.cresco.assesment.model.PrimaryKey;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass =JsonBinaryType.class)
    		
})
@Table(name="AccessbilitySettings")
public class AccessbilitySettings {
	
	@Id
	private PrimaryKey primarykey;
@Type(type = "jsonb")
@Column(columnDefinition="json")
private Optionjson Accessbility;
private int negative_mark;
public PrimaryKey getPrimarykey() {
	return primarykey;
}
public void setPrimarykey(PrimaryKey primarykey) {
	this.primarykey = primarykey;
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



}
