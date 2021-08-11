package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.LoginDetails;

@Repository
@EnableTransactionManagement
public class LoginDetailsDaoImpl implements LoginDetailsDao {

	@PersistenceContext
	private EntityManager em; 
	
	@Override
	@Transactional
	public boolean checkAdmin(String  email_id) {
		
		LoginDetails a1 = em.find(LoginDetails.class, email_id);
		boolean status = false;
		if(a1.getEmail_id() .equalsIgnoreCase(email_id)) {
			status = true;
		}
	    return status;
		
	}

	@Override
	@Transactional
	public String addAdminDryRun(LoginDetails a1) {
		em.persist(a1);
		String msg = "Admin record Added of id " + a1.getEmail_id();
		return msg;
	}

}
