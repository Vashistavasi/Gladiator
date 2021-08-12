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
	

	@GetMapping("/QuestionsList")
	public List<Question_Bank> getQuestionList(){
		return adminService.getQuestionsList();
	}
}
