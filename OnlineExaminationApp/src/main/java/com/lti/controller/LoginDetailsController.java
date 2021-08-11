package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.beans.LoginDetails;
import com.lti.services.LoginDetailServiceImpl;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/OnlineExam")
public class LoginDetailsController {

	@Autowired
	public LoginDetailServiceImpl loginService;
	
	@PostMapping("/addAdmin")
	public String addNewAdmin(@RequestBody LoginDetails a1) {
		
	return loginService.addAdminDryRun(a1);
	}
	
	@PostMapping("/AdminCheck")
     public String checkAdmin(@RequestBody String email_id)	{
		boolean status = loginService.checkAdmin(email_id);
		String msg = "Admin exist status " +status; 
		return msg;
	}
}
