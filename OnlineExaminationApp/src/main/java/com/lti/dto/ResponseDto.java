package com.lti.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResponseDto {
private String response;
@Id
private int ques_Id;
private int exam_Id;
public int getExam_Id() {
	return exam_Id;
}

public void setExam_Id(int exam_Id) {
	this.exam_Id = exam_Id;
}

public int getQues_Id() {
	return ques_Id;
}

public void setQues_Id(int ques_Id) {
	this.ques_Id = ques_Id;
}

public String getResponse() {
	return response;
}

public void setResponse(String response) {
	this.response = response;
}

@Override
public String toString() {
	return "ResponseDto [response=" + response + ", ques_Id=" + ques_Id + ", exam_Id=" + exam_Id + "]";
}

}
