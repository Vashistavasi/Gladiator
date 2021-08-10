package com.lti.dto;

import java.util.List;

import com.lti.beans.Exam_dtb;

public class AdminViewQuestionDto {
	private int ques_id;
	private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correct_answer;
    private String group_name;
    private int question_level;
	public int getQues_id() {
		return ques_id;
	}
	public int getQuestion_level() {
		return question_level;
	}
	public void setQuestion_level(int question_level) {
		this.question_level = question_level;
	}
	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
    
}