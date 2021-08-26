package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.beans.LoginDetails;
import com.lti.dto.Message;
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
	
	@GetMapping("/AdminCheck/{email_id}")
     public boolean checkAdmin(@PathVariable(value="email_id") String email_id)	{
		System.out.println(email_id+"this is controller");
		boolean status = loginService.checkAdmin(email_id);
		String msg = "Admin exist status " +status; 
		
		return status;
	}
	@GetMapping("/CheckDetails/{email_id}/{pwd}")
	  public Message checkDetails(@PathVariable(value="email_id") String email_id,@PathVariable(value="pwd")String pwd)	{
			
			
					return loginService.checkDetails(email_id,pwd);
			//String msg = "Admin exist status " +status; 
			
		}
	@GetMapping("/CheckDetailsAdmin/{email_id}/{pwd}")
	  public Message checkDetailsAdmin(@PathVariable(value="email_id") String email_id,@PathVariable(value="pwd")String pwd)	{
			
			
					return loginService.checkDetailsAdmin(email_id,pwd);
			//String msg = "Admin exist status " +status; 
			
		
		}
}
