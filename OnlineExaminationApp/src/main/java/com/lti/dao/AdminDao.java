package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Questionbank;
@Repository
public class AdminDao extends Generic_Dao {

	@PersistenceContext
	EntityManager entityManager;

	public List<Exam_dtb> fetchAllSubjects() {
		return entityManager
				.createNamedQuery("fetch-all")
				.getResultList();
	}

	public List<Questionbank> fetchQuestionByExamId(int examId) {
		return entityManager
				.createQuery("select question from Question_bank question where question.exam_id.exam_id = :eId and active = 1")
				.setParameter("eId", examId)
				.getResultList();
	}

	public List<Questionbank> fetchAllQuestion() {
		return entityManager
				.createQuery("select question from Question_bank question")
				.getResultList();
	}

}