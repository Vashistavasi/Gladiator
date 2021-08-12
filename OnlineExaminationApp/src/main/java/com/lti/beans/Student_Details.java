package com.lti.beans;

import java.sql.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student_Details{
	@Id
	 private int stu_id;

	 private String name;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "email_id") 
	 private LoginDetails login; 
		
		
		 
	 
	 
	 private String password;
	 private int mobile_no;
	 private String city;
	 private String state;
	 private Date  dob;
	 private  String qualification;
	 private  int year_of_graduation;
	 
	 

	public Student_Details() {
		super();
	}
	
	

	public Student_Details(int stu_id, String name, LoginDetails login, String password, int mobile_no, String city,
			String state, Date dob, String qualification, int year_of_graduation) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.login = login;
		this.password = password;
		this.mobile_no = mobile_no;
		this.city = city;
		this.state = state;
		this.dob = dob;
		this.qualification = qualification;
		this.year_of_graduation = year_of_graduation;
	}
	
	



	public LoginDetails getLogin() {
		return login;
	}



	public void setLogin(LoginDetails login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	 
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear_of_graduation() {
		return year_of_graduation;
	}
	public void setYear_of_graduation(int year_of_graduation) {
		this.year_of_graduation = year_of_graduation;
	}
	
	
	@Override
	public String toString() {
		return "Student_Information [stu_id=" + stu_id + ", name=" + name + ", login=" + login + ", password="
				+ password + ", mobile_no=" + mobile_no + ", city=" + city + ", state=" + state + ", dob=" + dob
				+ ", qualification=" + qualification + ", year_of_graduation=" + year_of_graduation + "]";
	}
	
	   

}