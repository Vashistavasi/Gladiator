package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AdminInfo {
	@Id
	@GeneratedValue
	private int admin_id;
	
	@Column(nullable = false)
    private String name; //varchar2(50) NOT NULL,
	
	@JoinColumn
    @OneToOne
    private LoginDetails  email_id; //varchar2(100) NOT NULL UNIQUE,
	
    @Override
	public String toString() {
		return "AdminInfo [admin_id=" + admin_id + ", name=" + name + ", email_id=" + email_id + ", mobile_no="
				+ mobile_no + "]";
	}
	public AdminInfo(int admin_id, String name, LoginDetails email_id, int mobile_no) {
		super();
		this.admin_id = admin_id;
		this.name = name;
		this.email_id = email_id;
		this.mobile_no = mobile_no;
	}
	private int mobile_no; //NUMBER(10) NOT NULL,
    
    public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LoginDetails  getEmail_id() {
		return email_id;
	}
	public void setEmail_id(LoginDetails email_id) {
		this.email_id = email_id;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	


}