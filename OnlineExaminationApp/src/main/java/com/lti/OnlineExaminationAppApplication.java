package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lti.services.AdminService;
import com.lti.services.AdminServiceImpl;

@SpringBootApplication
public class OnlineExaminationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineExaminationAppApplication.class, args);
		
	}
	

}
