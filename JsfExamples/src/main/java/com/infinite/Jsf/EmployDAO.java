package com.infinite.Jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class EmployDAO implements Serializable{
	
	public List<Employ> showEmploy(){
		List<Employ> employlist = new ArrayList<Employ>();
		employlist.add(new Employ(1,"Gaurav","Java","Developer",1267.55));
		employlist.add(new Employ(2,"haritha","Java","Developer",1234.55));
		employlist.add(new Employ(3,"saritha","Java","Developer",1256.55));
		employlist.add(new Employ(4,"Gaurav","Java","Developer",1267.55));
		return employlist;
		
		
		
	}
	

}
