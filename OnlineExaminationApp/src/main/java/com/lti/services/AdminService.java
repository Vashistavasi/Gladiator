package com.lti.services;

import java.util.List;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Question_Bank;
import com.lti.beans.Report;
import com.lti.dto.QuestionDto;
import com.lti.dto.ResponseDto;


public interface AdminService {

	

public	String addQuestion(Question_Bank q);
public List<Question_Bank> getQuestionsList();
public List<QuestionDto> getquestions();
public int validateResponse(ResponseDto r);
public int saveResponse(ResponseDto r);
public Report generatedReport(int id);
public long validation(int id) ;
public int getId_Email(String email);
public List<Report> allStudentReports();
public List<QuestionDto>getquestions(int exam_id);
public List<QuestionDto> getquestions(int exam_id,int stu_id);

}