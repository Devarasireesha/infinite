package com.infinite.Jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped

public class Employ implements Serializable{
	private int empno;
	private String name;
	private String dept;
	private String gender;
	private String desig;
	private double basic;
	public Employ(int empno, String name, String dept, String gender, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.gender = gender;
		this.desig = desig;
		this.basic = basic;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
}