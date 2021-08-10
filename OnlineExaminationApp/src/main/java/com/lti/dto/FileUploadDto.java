package com.lti.dto;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadDto {

	private int exam_id;
	private MultipartFile csvFile;
	
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public MultipartFile getCsvFile() {
		return csvFile;
	}
	public void setCsvFile(MultipartFile csvFile) {
		this.csvFile = csvFile;
	}
	
	
}