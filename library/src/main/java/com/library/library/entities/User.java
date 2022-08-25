package com.library.library.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="User")
public class User {
	
	@Id
	private String userid;
	private String userName;
	private String dob;
	private String phoneNumber;
	
	
	public User() {}
	
	public User(String userid, String userName, String dob, String phoneNumber) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		
	}

	public String getId() {
		return userid;
	}

	public void setId(String userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
