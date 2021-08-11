package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoginDetails")
public class LoginDetails {

	@Id
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "password")
	private String password;
	//private String accesstype;

	public LoginDetails(String email_id, String password) {
		super();
		this.email_id = email_id;
		this.password = password;
	}
	public LoginDetails() {
		super();
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDetails [email_id=" + email_id + ", password=" + password + "]";
	}
	
	
	
}
