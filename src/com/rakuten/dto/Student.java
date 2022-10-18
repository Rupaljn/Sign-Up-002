package com.rakuten.dto;

import java.util.Date;

import com.rakuten.exceptions.DataInvalidException;

public class Student {
	private int id;
	private long contactNumber;
	private String fullName;
	private String emailId;
	private String password;
	private Date createdDate;
	private String createdBy;
	private Date modifieDate;
	private String moifieBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createDate) {
		this.createdDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifieDate() {
		return modifieDate;
	}

	public void setModifieDate(Date modifieDate) {
		this.modifieDate = modifieDate;
	}

	public String getMoifieBy() {
		return moifieBy;
	}

	public void setMoifieBy(String moifieBy) {
		this.moifieBy = moifieBy;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		if (fullName.length() < 3) {
			throw new DataInvalidException("Name should be grather than 3 latter");
		}
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		if (emailId.length() < 5) {
			throw new DataInvalidException("Please enter your full email address");
		}
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			throw new DataInvalidException("Password should be 8 charater");
		}
		this.password = password;
	}
}
