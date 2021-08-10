package com.lti.services;

import java.util.List;

import com.lti.beans.Exam_dtb;
import com.lti.beans.Questionbank;

public interface AdminService {

	void save(Object obj);

	List<Exam_dtb> fetchAllSubjects();

	Exam_dtb fetchExamById(int examId);

	Questionbank fetchQuestion(int id);

	List<Questionbank> fetchQuestionByExamId(int examId);

	void readFile(int exam_id, String fileName, String targetFile) throws Exception;

	List<Questionbank> fetchAllQuestions();

}