package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Que")
public class Question_Bank {
    @Id
   
    @Column(name = "q_Id")
	private int ques_id;
    @Column(name = "e_Id")
    private int exam_id;
    @Column(name = "q_question")
    private String question;
    @Column(name = "q_opt1")
    private String option1;
    @Column(name = "q_opt2")
    private String option2;
    @Column(name = "q_opt3")
    private String option3;
    @Column(name = "q_opt4")
    private String option4;
    @Column(name = "q_c_answer")
    private String correct_answer;
    @Column(name = "q_level")
    private int question_level;
    @Column(name = "q_marks")
    private int marks;
    @Column(name = "q_group")
    private String group_name;
   


  
	public int getQues_id() {
		return ques_id;
	}
	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
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
	public int getQuestion_level() {
		return question_level;
	}
	public void setQuestion_level(int question_level) {
		this.question_level = question_level;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	
}
