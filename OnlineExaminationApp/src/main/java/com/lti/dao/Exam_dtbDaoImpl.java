package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Exam_dtb;

@Repository("examDao")
@EnableTransactionManagement
public class Exam_dtbDaoImpl implements Exam_dtbDao {

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	@Transactional
	public String addQuestion(Exam_dtb ex1) {
		em.persist(ex1);
		String msg = "Exam record Added of id " + ex1.getExam_id();
		return msg;
	}

}
