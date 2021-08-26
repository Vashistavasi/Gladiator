package com.lti.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.lti.dto.AdminViewQuestionDto;
import com.lti.dto.FileUploadDto;
import com.lti.dto.QuestionDto;
import com.lti.dto.ResponseDto;
import com.lti.beans.Exam_dtb;
import com.lti.beans.Question_Bank;

import com.lti.services.AdminService;
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/OnlineExam")
public class AdminController {

	@Autowired
	private AdminService adminService;
	@PostMapping("/addquestion")
	public String addNewExam(@RequestBody Question_Bank q) {
		return adminService.addQuestion(q);
	}

	@RequestMapping(path = "/beginexam", method=RequestMethod.GET)
	public List<QuestionDto> beginexam()
	{
		return adminService.getquestions(); 
	}
	@RequestMapping(path = "/beginexam/{exam_id}", method=RequestMethod.GET)
	public List<QuestionDto> beginexam(@PathVariable (value="exam_id")int exam_id)
	{
		return adminService.getquestions(exam_id); 
	}
	
	@RequestMapping(path = "/beginexams/{exam_id}/{email_id}", method=RequestMethod.GET)
	public List<QuestionDto> beginexam(@PathVariable (value="exam_id")int exam_id,@PathVariable (value="email_id")String email_id)
	{
		int stu_id=adminService.getId_Email(email_id);
		return adminService.getquestions(exam_id,stu_id); 
	}
	
	

	@GetMapping("/QuestionsList")
	public List<Question_Bank> getQuestionList(){
		return adminService.getQuestionsList();
	}
	@RequestMapping(path="/saveresponse",method=RequestMethod.POST)
	public int saveresponse(@RequestBody ResponseDto r)
	{
	
		System.out.println("Above");
		System.out.println(r);
		System.out.println("this");
		adminService.saveResponse(r);
//	int s=adminService.validateResponse(r);
//		System.out.println("The acheived score is "+ s);
		return 0;
		
	}
}
