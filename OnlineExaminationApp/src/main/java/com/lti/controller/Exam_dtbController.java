package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Exam_dtb;
import com.lti.services.Exam_dtbServiceImpl;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/OnlineExam")
public class Exam_dtbController {

	@Autowired
	public Exam_dtbServiceImpl examService;
	
	@PostMapping("/addnewExam")
	public String AddNewExam(@RequestBody Exam_dtb ex1) {
		return examService.addQuestion(ex1);
	}
	
}
