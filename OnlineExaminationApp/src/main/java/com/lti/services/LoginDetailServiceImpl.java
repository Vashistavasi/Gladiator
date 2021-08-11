package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.LoginDetails;
import com.lti.dao.LoginDetailsDaoImpl;

@Service
public class LoginDetailServiceImpl implements LoginDetailsService {

	@Autowired
	public LoginDetailsDaoImpl loginDao;
	
	@Override
	public boolean checkAdmin(String email_id) {
		
		return loginDao.checkAdmin(email_id);
	}

	@Override
	public String addAdminDryRun(LoginDetails a1) {
		
		return loginDao.addAdminDryRun(a1);
	}

}
