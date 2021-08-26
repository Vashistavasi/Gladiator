package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Report;
import com.lti.services.AdminService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/OnlineExam")
public class ReportController {
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/report")
	public Report getReport(){
		adminService.validation(5006);
		return  adminService.generatedReport(5006);
	}
	@GetMapping("/report/{id}")
	public Report getReports(@PathVariable (value="id")int id){
		adminService.validation(id);
		return  adminService.generatedReport(id);
	}
	@GetMapping("/reports/{email_id}")
	public Report getReports(@PathVariable (value="email_id")String email_id){
		int id=adminService.getId_Email(email_id);
		adminService.validation(id);
		return  adminService.generatedReport(id);
	}
	@GetMapping("/all_student_reports")
	public List<Report> allStudentReports(){
		return adminService.allStudentReports();
		
	}
	
}
