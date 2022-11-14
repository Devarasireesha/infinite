package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface UserBeanRemote {
	
	UserDetails searchUserDetailsBean(int userDetails) throws ClassNotFoundException, SQLException;
	List<DriverDetails> showDriverDetailsBean() throws ClassNotFoundException, SQLException;

}
