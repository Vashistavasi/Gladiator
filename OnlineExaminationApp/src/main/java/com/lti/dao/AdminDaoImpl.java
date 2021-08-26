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
import com.lti.beans.Report;
import com.lti.beans.Student_Details;
import com.lti.dto.ResponseDto;

@Repository("adminDao")
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao  {
public int score;
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
		
		String sql = "SELECT e from Question_Bank e ";
		Query qry = entityManager.createQuery(sql);
		List<Question_Bank> queList = qry.getResultList();
		System.out.println("Inside getqueList");
		return queList;
	}
	@Override
	@Transactional
	public void intializeResponseDto(){
		System.out.println();
		System.out.println("Inside deletion of Response dto table");
		String sql2 = "DELETE from ResponseDto";
		Query qry2 = entityManager.createQuery(sql2);
qry2.executeUpdate();
System.out.println();
System.out.println("Exiting deletion");
	}
	
	@Override
	@Transactional
	public List<Question_Bank> getQuestionsList(int exam_id) {		
		String sql = "SELECT e from Question_Bank e where e.exam_id=:id";
		Query qry = entityManager.createQuery(sql);
		qry.setParameter("id",exam_id);
		List<Question_Bank> queList = qry.getResultList();
		System.out.println("Inside getqueList");
		return queList;
	}

	@Override
	@Transactional
	public List<Question_Bank> getQuestionsList(int exam_id,int stu_id) {
		Report r=entityManager.find(Report.class, stu_id);
	int marks=(int) r.getMarks();
	Student_Details s=r.getStu_id();
	 Exam_dtb e= r.getExam_id();
	 entityManager.remove(r);
	  
	 System.out.println("you are looking for this"+e);
	 System.out.println("this is the value of r "+ r);
	 e.setExam_id(exam_id);
	r.setExam_id(e);
	System.out.println("this is the value of r "+ r);
	//entityManager.persist(r);
	
//	String query="update report set exam_id=:id where stu_id"
	
	 
		String sql = "SELECT e from Question_Bank e where e.exam_id=:id";
		Query qry = entityManager.createQuery(sql);
		qry.setParameter("id",exam_id);
		List<Question_Bank> queList = qry.getResultList();
		System.out.println("Inside getqueList");
		return queList;
	}
	
	
	
	
	
	
	@Override
	@Transactional
	public long validateResponse() {
		 String sql = " select count(q) from Question_Bank q, ResponseDto r"
		 		+ " where  (q.ques_id=r.ques_Id and q.correct_answer=r.response) ";
//		 String sql = " select count(q) from Question_Bank q"
//			 		;
		 Query qry = entityManager.createQuery(sql);
		 long crct_ans_count= (long) qry.getSingleResult();
//		 List<String> crctAnsList = qry.getResultList();
//		 for(int i=0;i<crctAnsList.size();i++) {
//			 if(r.getResponse().equalsIgnoreCase(crctAnsList.get(i))){
//				 score+=1;
//			 }
		
			 return crct_ans_count;
		 }
		 //just to add marks to report
		@Override
		@Transactional
		public int validation(int id){
			
			Report r=entityManager.find(Report.class, id);
			long i=validateResponse();
			r.setMarks(i);
			entityManager.merge(r);

			return 0;
		}
		//to retrive report
		@Override
		public Report generateReport(int id) {
			
			Report r=entityManager.find(Report.class, id);
			
			return r;
		}
		@Override
		public List<Report> allStudentReports() {
			String sql = "SELECT e from Report e";
			Query qry = entityManager.createQuery(sql);
			List<Report> studentReportList = qry.getResultList();
			System.out.println("Inside getAllStudentReports");
			return studentReportList;
		}
	

	
	@Override
	@Transactional
	public int saveResponse(ResponseDto r) {

		ResponseDto a=entityManager.find(ResponseDto.class, r.getQues_Id());
		if(a==null)
		entityManager.persist(r);
		else {
		a.setResponse(r.getResponse());
			entityManager.merge(a);
		}
		return 0;
	}
	@Override
	@Transactional
	public int getId_Email(String email) {
		String sql ="select s.stu_id from Student_Details s join s.login l where l.email_id=:email";
		Query qry = entityManager.createQuery(sql);
		qry.setParameter("email", email);
		List<Integer> studentList = qry.getResultList();
		int stu_id=studentList.get(0);
		
		
		
		System.out.println("Knock Knock here is your stud_id "+ stu_id);
		return stu_id;
	}

}