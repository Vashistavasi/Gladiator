package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.LoginDetails;
import com.lti.dto.Message;

@Repository
@EnableTransactionManagement
public class LoginDetailsDaoImpl implements LoginDetailsDao {

	@PersistenceContext
	private EntityManager em; 
	LoginDetails a1 ;
	@Override
	@Transactional
	public boolean checkAdmin(String  email_id) {
		System.out.println(email_id+"inside dao");
		LoginDetails a1 = em.find(LoginDetails.class, email_id);
		System.out.println(a1);
		boolean status = false;
		if(a1.getEmail_id() .equalsIgnoreCase(email_id)) {
			status = true;
		}
		
	    return status;
		
	}
	public Message checkDetailsAdmin(String email_id, String pwd) {
		Message m=new Message();
		a1 = em.find(LoginDetails.class, email_id);
		if(a1==null) {
			m.setMsg("User does not exists");
			return m;
		}
		if(a1.getAccesstype().equalsIgnoreCase("admin")) {
		if(a1.getEmail_id() .equalsIgnoreCase(email_id) && a1.getPassword().equalsIgnoreCase(pwd)) {
			m.setMsg("Login Successfull");
			return m;
		}
		else{	
			m.setMsg("Wrong Password");}
		}
		else {
			m.setMsg("User is a Student.Use student Login");
		}
	
	    return m;
	}


	@Override
	@Transactional
	public String addAdminDryRun(LoginDetails a1) {
		em.persist(a1);
		String msg = "Admin record Added of id " + a1.getEmail_id();
		return msg;
	}
	@Override
	public Message checkDetails(String  email_id,String pwd) {
		Message m=new Message();
		a1 = em.find(LoginDetails.class, email_id);
		if(a1==null) {
			m.setMsg("User does not exists");
			return m;
		}
		if(a1.getAccesstype().equalsIgnoreCase("student")) {
		if(a1.getEmail_id() .equalsIgnoreCase(email_id) && a1.getPassword().equalsIgnoreCase(pwd)) {
			m.setMsg("Login Successfull");
			return m;
		}
		else{	
			m.setMsg("Wrong Password");}
		}
		else {
			m.setMsg("User is an Admin.Use Admin Login");
		}
	
	    return m;
	}
	

}
