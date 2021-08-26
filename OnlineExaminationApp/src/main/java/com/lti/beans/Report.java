package com.lti.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="New_Report")
public class Report implements Serializable{
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="exam_id")
private Exam_dtb exam_id;
@Id
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "stu_id") 
private Student_Details stu_id;
private long marks;

public Exam_dtb getExam_id() {
	return exam_id;
}

public void setExam_id(Exam_dtb exam_id) {
	this.exam_id = exam_id;
}

@Override
public String toString() {
	return "Report [exam_id=" + exam_id + ", stu_id=" + stu_id + ", marks=" + marks + "]";
}

public Student_Details getStu_id() {
	return stu_id;
}
public void setStu_id(Student_Details stu_id) {
	this.stu_id = stu_id;
}
public long getMarks() {
	return marks;
}
public void setMarks(long i) {
	this.marks = i;
}

}
