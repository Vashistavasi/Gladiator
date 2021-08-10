package com.lti.services;

import com.lti.beans.Student_Information;

public interface StudentService {
	void RegisterUser(Student_Information studentinfo);
	Student_Information login(String email, String password)throws Exception;
	void save(Object obj);
}
