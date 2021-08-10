package com.lti.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.controller.AdminController.Status.StatusType;
import com.lti.dto.AdminViewQuestionDto;
import com.lti.dto.FileUploadDto;
import com.lti.beans.Exam_dtb;
import com.lti.beans.Questionbank;
import com.lti.services.AdminService;

@RestController
@CrossOrigin(origins="*")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping(path = "/addsubject")
	public void addSubject(Exam_dtb exam) {
		adminService.save(exam);
	}

	@PostMapping(path = "/viewsubject")
	public Exam_dtb fetchSubjetById(int examId) {
		return adminService.fetchExamById(examId);
	}

	@GetMapping("/subjectlist")
	public List<Exam_dtb> fetchAllSubject() {
		return adminService.fetchAllSubjects();
	}

	@PostMapping(path = "/addquestion")
	public Status addQuestion(Questionbank question) {
		try {
			adminService.save(question);
			Status status = new Status();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Questions added successfully!");
			return status;
		} catch (Exception e) {
			Status status = new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
	}

	@RequestMapping(path = "/fetchquestion/{examId}", method = RequestMethod.GET)
	public List<AdminViewQuestionDto> fetchQuestionByExamId(@PathVariable int examId) {
		List<AdminViewQuestionDto> list = new ArrayList<AdminViewQuestionDto>();

		for (Questionbank obj : adminService.fetchQuestionByExamId(examId)) {
			AdminViewQuestionDto adminViewQuestionDto = new AdminViewQuestionDto();
			BeanUtils.copyProperties(obj, adminViewQuestionDto);
			list.add(adminViewQuestionDto);
		}
		return list;

	}

	@PostMapping("/file-upload")
	public Status upload(FileUploadDto fileUploadDto) throws Exception {
		String fileUploadLocation = "d:/uploads/csv";
		String fileName = fileUploadDto.getCsvFile().getOriginalFilename();
		String targetFile = fileUploadLocation + fileName;
		try {
			FileCopyUtils.copy(fileUploadDto.getCsvFile().getInputStream(), new FileOutputStream(targetFile));
		} catch (IOException e) {
			e.printStackTrace();
			Status status = new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
		adminService.readFile(fileUploadDto.getExam_id(), fileName, targetFile);
		Status status = new Status();
		status.setStatus(StatusType.SUCCESS);
		status.setMessage("Uploaded!");
		return status;
	}

	@PostMapping("/delete-question")
	public Status upload(@RequestBody int indexes[]) {
		try {
			for(int i=0; i<indexes.length; i++) {
				Questionbank question_bank = new Questionbank();
				question_bank = adminService.fetchQuestion(indexes[i]);
				question_bank.setActive(0);
				adminService.save(question_bank);
				Status status = new Status();
				status.setStatus(StatusType.SUCCESS);
				status.setMessage("Questions deleted successfully!");
				return status;
			}
		} catch (Exception e) {
			Status status = new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
		return null;

	}

	public static class Status {
		private StatusType status;
		private String message;

		public static enum StatusType {
			SUCCESS, FAILURE;
		}

		public StatusType getStatus() {
			return status;
		}

		public void setStatus(StatusType status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

}
