package com.lti.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.lti.beans.Question_Bank;

public interface AdminDao {

	public String addQuestion(Question_Bank q);
	public List<Question_Bank> getQuestionsList();

}