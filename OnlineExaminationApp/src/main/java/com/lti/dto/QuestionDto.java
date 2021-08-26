package com.lti.dto;

import java.util.List;

public class QuestionDto {
	private int ques_Id;
	private int exam_Id;
	public int getQues_Id() {
		return ques_Id;
	}
	public void setQues_Id(int ques_Id) {
		this.ques_Id = ques_Id;
	}
	public int getExam_Id() {
		return exam_Id;
	}
	public void setExam_Id(int exam_Id) {
		this.exam_Id = exam_Id;
	}
	private String question;
	private List<optionsDto> options;
	private String response;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<optionsDto> getOptions() {
		return options;
	}
	public void setOptions(List<optionsDto> options) {
		this.options = options;
	}
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	

}
