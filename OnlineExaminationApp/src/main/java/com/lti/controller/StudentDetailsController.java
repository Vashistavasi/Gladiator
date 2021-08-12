package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Student_Details;
import com.lti.services.StudentServiceImpl;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/OnlineExam")
public class StudentDetailsController {
	
@Autowired
public StudentServiceImpl studentService;

@PostMapping("/RegisterStudent")
public String addNewStudent(@RequestBody Student_Details s) {
	return studentService.RegisterUser(s);
}
}