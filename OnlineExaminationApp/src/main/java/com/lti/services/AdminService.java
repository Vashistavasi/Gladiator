package com.lti.services;

import java.util.List;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Question_Bank;


public interface AdminService {

	

public	String addQuestion(Question_Bank q);
public List<Question_Bank> getQuestionsList();
}