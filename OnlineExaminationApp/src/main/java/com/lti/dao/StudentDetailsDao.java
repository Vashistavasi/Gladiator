package com.lti.dao;

import javax.transaction.Transactional;

import com.lti.beans.Student_Details;

public interface StudentDetailsDao {

	//	@Override
	public String RegisterUser(Student_Details s);

}