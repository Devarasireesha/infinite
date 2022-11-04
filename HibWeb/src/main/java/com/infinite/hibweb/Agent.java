package com.infinite.hibweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Agent")

public class Agent {
	
	@Id
	@Column(name="agentId")
	private int agentId;
	@Column(name="name")
	private String Name;
	@Column(name="City")
	private String City;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name="maritalStatus")
	private int maritalStatus;
	@Column(name="premium")
	private double premium;
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", Name=" + Name + ", City=" + City + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", premium=" + premium + "]";
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
		
	}
	

