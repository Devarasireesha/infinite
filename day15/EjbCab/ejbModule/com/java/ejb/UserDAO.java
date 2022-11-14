package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO {
	Connection connection;
	PreparedStatement pst;
	
	public UserDetails searchUserDetails(int userId)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from userdetails where userId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, userId);
		ResultSet rs = pst.executeQuery();
		UserDetails userDetails= null;
		if(rs.next()) {
			userDetails = new UserDetails();
			userDetails.setUserId(rs.getInt("userId"));
			userDetails.setPassCode(rs.getString("passCode"));
			userDetails.setUserName(rs.getString("userName"));
			userDetails.setFisrtName(rs.getString("firstName"));
			userDetails.setLastName(rs.getString("lastName"));
			userDetails.setCity(rs.getString("city"));
			userDetails.setState(rs.getString("state"));
			userDetails.setMobile(rs.getString("mobile"));
			userDetails.setEmail(rs.getString("email"));
	}
		return userDetails;

  }
	
	public List<DriverDetails> showDriverDetails() throws 
	ClassNotFoundException, SQLException {
    List<DriverDetails> driverDetailsList = new ArrayList<DriverDetails>();
    connection = ConnectionHelper.getConnection();
    String cmd = "select * from driverdetails";
     pst = connection.prepareStatement(cmd);
     ResultSet rs = pst.executeQuery();
     DriverDetails driverDetails = null;
     while(rs.next()) {
    	 driverDetails = new DriverDetails();
    	 driverDetails.setDriverId(rs.getInt("driverId"));
    	 driverDetails.setUserName(rs.getString("userName"));
    	 driverDetails.setPassword(rs.getString("password"));
    	 driverDetails.setFisrtName(rs.getString("firstName"));
    	 driverDetails.setLastName(rs.getString("lastName"));
    	 driverDetails.setCity(rs.getString("city"));
    	 driverDetails.setState(rs.getString("state"));
    	 driverDetails.setMobile(rs.getString("mobile"));
    	 driverDetails.setEmail(rs.getString("email"));
     }
     return driverDetailsList;
     }
	
}
