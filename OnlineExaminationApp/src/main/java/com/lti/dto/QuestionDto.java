package com.lti.dto;

import java.util.List;

public class QuestionDto {
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
