package com.java.ejb;

import java.io.Serializable;

public class UserDetails implements Serializable{
	private int userId;
	private String userName;
	private String passCode;
	private String fisrtName;
	private String lastName;
	private String city;
	private String state;
	private String mobile;
	private String email;
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
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserDetails(int userId, String userName, String passCode, String fisrtName, String lastName, String city,
			String state, String mobile, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passCode = passCode;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.mobile = mobile;
		this.email = email;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", passCode=" + passCode + ", fisrtName="
				+ fisrtName + ", lastName=" + lastName + ", city=" + city + ", state=" + state + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	

}
