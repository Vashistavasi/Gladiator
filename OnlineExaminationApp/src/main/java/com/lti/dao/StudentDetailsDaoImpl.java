package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lti.beans.Student_Details;

@Repository
@EnableTransactionManagement
public class StudentDetailsDaoImpl implements StudentDetailsDao  {

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	@Transactional
	public String RegisterUser(Student_Details s) {
		    em.persist(s);
			String msg = "Student  record Added of id " + s.getStu_id();
			return msg;
		
	}
	}