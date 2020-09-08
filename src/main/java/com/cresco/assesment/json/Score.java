package com.cresco.assesment.json;

import java.io.Serializable;

public class Score implements Serializable{
	private int Mark;
	private int NegativeMark;
	public int getMark() {
		return Mark;
	}
	public void setMark(int mark) {
		Mark = mark;
	}
	public int getNegativeMark() {
		return NegativeMark;
	}
	public void setNegativeMark(int negativeMark) {
		NegativeMark = negativeMark;
	}
	

}
