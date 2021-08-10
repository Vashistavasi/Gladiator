package com.lti.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.beans.Exam_dtb;
import com.lti.beans.Questionbank;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	public void save(Object obj) {
		adminDao.save(obj);
	}

	@Override
	public List<Exam_dtb> fetchAllSubjects(){
		return adminDao.fetchAllSubjects();

	}

	@Override
	public Exam_dtb fetchExamById(int examId) {
		return (adminDao.fetchById(Exam_dtb.class, examId));
	}

	@Override
	public Questionbank fetchQuestion (int id) {
		return (adminDao.fetchById(Questionbank.class, id));
	}

	@Override
	public List <Questionbank> fetchQuestionByExamId(int examId){
		return adminDao.fetchQuestionByExamId(examId);
	}

	@Override
	public void readFile(int exam_id, String fileName, String targetFile) throws Exception {
		List <Questionbank> questionList = new ArrayList<Questionbank>();
		String file = targetFile;
		System.out.println("readingcsv lin by line");
		try (Stream<String> stream = Files.lines(Paths.get(file)).skip(1)) {
			stream.forEach(line -> {
				String[] split = line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
				Questionbank question = new Questionbank();

				question.setQuestion(split[0]);
				question.setOption1(split[1]);
				question.setOption2(split[2]);
				question.setOption3(split[3]);
				question.setOption4(split[4]);
				question.setCorrect_answer(split[5]);
				question.setQuestion_level(Integer.parseInt(split[6]));
				question.setMarks(Integer.parseInt(split[7]));
				question.setGroup_name(fileName);
				question.setActive(1);

				questionList.add(question);
			});
		}
		catch(IOException e) {
			throw new Exception("Error while reading complaints.csv file", e);
		}
		System.out.println("arraylist made" + exam_id );
		Exam_dtb exam = (adminDao.fetchById(Exam_dtb.class, exam_id));
		System.out.println(exam.getExam_id());

		for (Questionbank obj : questionList) {
			obj.setExam_id(exam);	
			adminDao.save(obj);
		}
	}


	@Override
	public List<Questionbank> fetchAllQuestions(){
		return adminDao.fetchAllQuestion();
	}


}