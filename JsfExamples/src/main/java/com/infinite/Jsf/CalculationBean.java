package com.infinite.Jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped

public class CalculationBean implements Serializable{
	
	private int FirstNumber;
	private int secondNumber;
	public int getFirstNumber() {
		return FirstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		FirstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public static void main(String[] args) {
		
		
	}
		
	

}
