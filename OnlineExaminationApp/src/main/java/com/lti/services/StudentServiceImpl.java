package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Student_Details;

import com.lti.dao.StudentDetailsDaoImpl;
import com.lti.exception.StudentServiceException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentDetailsDaoImpl studentDao;
	
	@Override
	public String RegisterUser(Student_Details s) {
     
		return studentDao.RegisterUser(s);
	}
	


}
