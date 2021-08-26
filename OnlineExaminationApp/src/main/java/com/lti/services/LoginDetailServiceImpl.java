package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.LoginDetails;
import com.lti.dao.LoginDetailsDaoImpl;
import com.lti.dto.Message;

@Service
public class LoginDetailServiceImpl implements LoginDetailsService {

	@Autowired
	public LoginDetailsDaoImpl loginDao;
	
	@Override
	public boolean checkAdmin(String email_id) {
		System.out.println(email_id+"this is service");
		
		return loginDao.checkAdmin(email_id);
	}

	@Override
	public String addAdminDryRun(LoginDetails a1) {
		
		return loginDao.addAdminDryRun(a1);
	}
	@Override
	public Message checkDetails(String email_id, String pwd) {
		// TODO Auto-generated method stub
		return loginDao.checkDetails(email_id, pwd);
	}
	

	public Message checkDetailsAdmin(String email_id, String pwd) {
		// TODO Auto-generated method stub
		return loginDao.checkDetailsAdmin(email_id, pwd);
	}

}
