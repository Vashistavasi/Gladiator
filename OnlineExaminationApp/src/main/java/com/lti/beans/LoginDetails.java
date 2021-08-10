package com.lti.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginDetails {

	@Id
	private String email_id;
	
	private String password;
	private String accesstype;
	public LoginDetails(String email_id, String password, String accesstype) {
		super();
		this.email_id = email_id;
		this.password = password;
		this.accesstype = accesstype;
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
	public String getAccesstype() {
		return accesstype;
	}
	public void setAccesstype(String accesstype) {
		this.accesstype = accesstype;
	}
	@Override
	public String toString() {
		return "LoginDetails [email_id=" + email_id + ", password=" + password + ", accesstype=" + accesstype + "]";
	}
	
	
}
