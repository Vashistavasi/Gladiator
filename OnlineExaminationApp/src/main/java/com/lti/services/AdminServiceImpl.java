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
import com.lti.beans.Exam_dtb;
import com.lti.beans.Question_Bank;


@Service("admin_service")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override 
	public String addQuestion(Question_Bank q) {
		String msg=adminDao.addQuestion(q);
		return msg;
	}
	
	@Override
	public List<Question_Bank> getQuestionsList() {
		return adminDao.getQuestionsList();
	}
}