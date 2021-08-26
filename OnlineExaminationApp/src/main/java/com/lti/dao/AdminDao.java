package com.lti.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.lti.beans.Question_Bank;
import com.lti.beans.Report;
import com.lti.dto.ResponseDto;

public interface AdminDao {

	public String addQuestion(Question_Bank q);
	public List<Question_Bank> getQuestionsList();
	public long validateResponse();
	public int validation(int id);
	public int saveResponse(ResponseDto r);
	public Report generateReport(int id);
	public List<Report> allStudentReports();
	public List<Question_Bank> getQuestionsList(int exam_id);
	public int getId_Email(String email);
	public List<Question_Bank> getQuestionsList(int exam_id,int stu_id);
	public void intializeResponseDto();
}