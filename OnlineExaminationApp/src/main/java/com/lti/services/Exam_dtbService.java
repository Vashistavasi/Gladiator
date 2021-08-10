package com.lti.services;

import java.util.List;

import com.lti.beans.Exam_dtb;

public interface Exam_dtbService {

	public abstract String addQuestion(Exam_dtb ex);
	
	public abstract List<Exam_dtb> getExamList();
}
