package com.lti.dao;

import com.lti.beans.LoginDetails;

public interface LoginDetailsDao {

	
	public abstract boolean checkAdmin(String email_id);
    public abstract String addAdminDryRun( LoginDetails a1);
}
