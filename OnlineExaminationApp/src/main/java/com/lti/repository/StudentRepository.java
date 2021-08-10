package com.lti.repository;

import com.lti.beans.LoginDetails;
import com.lti.beans.Student_Information;

public interface StudentRepository {

	public void RegisterUser(Student_Information studentinfo);
	void save(Object obj);
	boolean isUserPresent(String email);
	int findByEmailAndPassword(String email, String password);
	Student_Information findById(int id);
	public void savelogin(LoginDetails ls);
	
}
