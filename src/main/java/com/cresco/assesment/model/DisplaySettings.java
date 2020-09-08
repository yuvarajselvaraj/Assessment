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

import com.cresco.assesment.json.Optionjson;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;


@SuppressWarnings("serial")
@Entity

@TypeDefs({
    @TypeDef(name = "jsonb", typeClass =JsonBinaryType.class)
    		
})
@Table(name="DisplaySettings")
public class DisplaySettings implements Serializable{
	

	 
	@Id
	private PrimaryKey primarykey;
	
	@Type(type = "jsonb")
	@Column(name="Objectjson",columnDefinition="json")
	private Optionjson ajson;
	
	public Optionjson getAjson() {
		return ajson;
	}
	public void setAjson(Optionjson ajson) {
		this.ajson = ajson;
	}
	public PrimaryKey getPrimarykey() {
		return primarykey;
	}
	public void setPrimarykey(PrimaryKey primarykey) {
		this.primarykey = primarykey;
	}
	
	
}
