package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Question_Bank;

@Repository("adminDao")
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao  {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public String addQuestion(Question_Bank q) {
		entityManager.persist(q);
		String msg="Question recore Added of subject "+q.getExam_id();
		return msg;
	}
	
	@Override
	public List<Question_Bank> getQuestionsList() {
		
		String sql = "SELECT e from Question_Bank e";
		Query qry = entityManager.createQuery(sql);
		List<Question_Bank> queList = qry.getResultList();
		System.out.println("Inside getqueList");
		return queList;
	}

}