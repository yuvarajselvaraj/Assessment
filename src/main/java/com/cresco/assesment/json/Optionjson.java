package com.cresco.assesment.json;

import java.io.Serializable;
import java.util.List;
public class Optionjson implements Serializable {
	private List<String> yes;
	private List<String> no;
	public List<String> getYes() {
		return yes;
	}
	public void setYes(List<String> yes) {
		this.yes = yes;
	}
	public List<String> getNo() {
		return no;
	}
	public void setNo(List<String> no) {
		this.no = no;
	}

	
	
}
