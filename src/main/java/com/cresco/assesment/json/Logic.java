package com.cresco.assesment.json;

import java.io.Serializable;

public class Logic implements Serializable {
private int  Option;
private int Question;
public int getOption() {
	return Option;
}
public void setOption(int option) {
	Option = option;
}
public int getQuestion() {
	return Question;
}
public void setQuestion(int question) {
	Question = question;
}

}
