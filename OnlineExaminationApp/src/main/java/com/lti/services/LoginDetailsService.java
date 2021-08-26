package com.lti.services;

import com.lti.beans.Exam_dtb;
import com.lti.beans.LoginDetails;
import com.lti.dto.Message;

public interface LoginDetailsService {
	
	public boolean checkAdmin(String email_id);
    public abstract String addAdminDryRun(LoginDetails a1);
	public abstract Message checkDetails(String email_id,String pwd);
	public abstract Message checkDetailsAdmin(String email_id,String pwd);
}
