package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Entity
@Component
public class UserAccessEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column
	private String userName;
	
	@Column
	private String emailId;
	
	@Column
	private String password;
	

	
	public UserAccessEntity(String userName, String emailId, String password) {
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserAccessEntity() {
		// TODO Auto-generated constructor stub
	}

		
	
	
	
}
