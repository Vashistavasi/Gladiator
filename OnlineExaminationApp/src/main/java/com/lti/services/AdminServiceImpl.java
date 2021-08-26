package com.lti.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.dto.QuestionDto;
import com.lti.dto.ResponseDto;
import com.lti.dto.optionsDto;
import com.lti.beans.Exam_dtb;
import com.lti.beans.Question_Bank;
import com.lti.beans.Report;


@Service("admin_service")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override 
	public String addQuestion(Question_Bank q) {
		String msg=adminDao.addQuestion(q);
		return msg;
	}
	public long validation(int id) {
		return adminDao.validation(id);
	}
	public Report generatedReport(int id) {
		return adminDao.generateReport(id);
	}
	public int getId_Email(String email) {
		return adminDao.getId_Email(email);
	}
	
	@Override
	public List<Question_Bank> getQuestionsList() {
		return adminDao.getQuestionsList();
	}
	@Override
	public List<Report> allStudentReports() {
		return adminDao.allStudentReports();
	}
	
	@Override
	public List<QuestionDto> getquestions()
	{
		List<Question_Bank> questions=adminDao.getQuestionsList();
		List<QuestionDto> qdtolist=new ArrayList<QuestionDto>(); 
		for(Question_Bank q:questions) {
			
			QuestionDto questiondto=new QuestionDto();
			List<optionsDto> options=new ArrayList<optionsDto>();
			questiondto.setQues_Id(q.getQues_id());
			questiondto.setExam_Id(q.getExam_id());
			questiondto.setQuestion(q.getQuestion());
			options.add(new optionsDto(q.getOption1()));
			options.add(new optionsDto(q.getOption2()));
			options.add(new optionsDto(q.getOption3()));
			options.add(new optionsDto(q.getOption4()));
			questiondto.setOptions(options);
			questiondto.setResponse(q.getCorrect_answer());
			qdtolist.add(questiondto);
		}
		return qdtolist;
	}
	@Override
	public List<QuestionDto> getquestions(int exam_id)
	{
		adminDao.intializeResponseDto();
		List<Question_Bank> questions=adminDao.getQuestionsList(exam_id);
		List<QuestionDto> qdtolist=new ArrayList<QuestionDto>(); 
		for(Question_Bank q:questions) {
			
			QuestionDto questiondto=new QuestionDto();
			List<optionsDto> options=new ArrayList<optionsDto>();
			questiondto.setQues_Id(q.getQues_id());
			questiondto.setExam_Id(q.getExam_id());
			questiondto.setQuestion(q.getQuestion());
			options.add(new optionsDto(q.getOption1()));
			options.add(new optionsDto(q.getOption2()));
			options.add(new optionsDto(q.getOption3()));
			options.add(new optionsDto(q.getOption4()));
			questiondto.setOptions(options);
			questiondto.setResponse(q.getCorrect_answer());
			qdtolist.add(questiondto);
		}
		return qdtolist;
	}
	@Override
	public List<QuestionDto> getquestions(int exam_id,int stu_id)
	{
		List<Question_Bank> questions=adminDao.getQuestionsList(exam_id,stu_id);
		List<QuestionDto> qdtolist=new ArrayList<QuestionDto>(); 
		for(Question_Bank q:questions) {
			
			QuestionDto questiondto=new QuestionDto();
			List<optionsDto> options=new ArrayList<optionsDto>();
			questiondto.setQues_Id(q.getQues_id());
			questiondto.setExam_Id(q.getExam_id());
			questiondto.setQuestion(q.getQuestion());
			options.add(new optionsDto(q.getOption1()));
			options.add(new optionsDto(q.getOption2()));
			options.add(new optionsDto(q.getOption3()));
			options.add(new optionsDto(q.getOption4()));
			questiondto.setOptions(options);
			questiondto.setResponse(q.getCorrect_answer());
			qdtolist.add(questiondto);
		}
		
		return qdtolist;
	}
	@Override
	public int validateResponse(ResponseDto r) {
		
		return (int) adminDao.validateResponse();
	}

	@Override
	public int saveResponse(ResponseDto r) {
		adminDao.saveResponse(r);
		return 0;
	}
	
	
	
}