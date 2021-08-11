package com.lti.services;

import com.lti.beans.Exam_dtb;
import com.lti.beans.LoginDetails;

public interface LoginDetailsService {

	public abstract boolean checkAdmin(String email_id);
    public abstract String addAdminDryRun(LoginDetails a1);
}
