package com.lti.dao;

import com.lti.beans.LoginDetails;
import com.lti.dto.Message;

public interface LoginDetailsDao {

	public Message checkDetails(String  email_id,String pwd);
	public abstract boolean checkAdmin(String email_id);
    public abstract String addAdminDryRun( LoginDetails a1);
    public Message checkDetailsAdmin(String email_id, String pwd);
}
