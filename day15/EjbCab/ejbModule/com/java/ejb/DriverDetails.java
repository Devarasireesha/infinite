package com.java.ejb;

import java.io.Serializable;

public class DriverDetails implements Serializable {
	private int driverId;
	private String userName;
	private String password;
	private String fisrtName;
	private String lastName;
	private String city;
	private String state;
	private String mobile;
	private String email;
	private String cabType;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	@Override
	public String toString() {
		return "DriverDetails [driverId=" + driverId + ", userName=" + userName + ", password=" + password
				+ ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", mobile=" + mobile + ", email=" + email + ", cabType=" + cabType + "]";
	}
	public DriverDetails(int driverId, String userName, String password, String fisrtName, String lastName, String city,
			String state, String mobile, String email, String cabType) {
		super();
		this.driverId = driverId;
		this.userName = userName;
		this.password = password;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.mobile = mobile;
		this.email = email;
		this.cabType = cabType;
	}
	public DriverDetails() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
