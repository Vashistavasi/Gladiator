package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Exam_dtb;
import com.lti.dao.Exam_dtbDao;
import com.lti.dao.Exam_dtbDaoImpl;

@Service("exam_dtbServe")
public class Exam_dtbServiceImpl implements Exam_dtbService {

 @Autowired
  public Exam_dtbDaoImpl examDao;

@Override
public String addQuestion(Exam_dtb ex1) {
	String msg = examDao.addQuestion(ex1);
	return msg;
}
 
  
}
