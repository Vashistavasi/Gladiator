package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Student_Information;
import com.lti.repository.StudentRepository;

public class StudentServiceImpl {
	@Autowired
	private StudentRepository studentrepo;
	
	
	@Transactional
	public Student_Information login(String email, String password) throws Exception{
		try {
			int id = studentrepo.findByEmailAndPassword(email, password);
			Student_Info studentinfo= studentrepo.findById(id);
			return studentinfo;	
		}
		catch(Exception e) {
			System.out.println("In catch");
			throw new StudentServiceException("Incorrect username/password");
			
		}
	}

	public void save(Object obj) {
		studentrepo.save(obj);
	}
	
	public void RegisterUser(Student_Information studentinfo) {
		
		//if(!studentrepo.isUserPresent(studentinfo.getEmail_id().getEmail_id())) {
		try {
			studentrepo.save(studentinfo);
		//}
		//else
		}
		catch(Exception e) {
			throw new StudentServiceException("Customer Already Registred");
		}
	}



}
