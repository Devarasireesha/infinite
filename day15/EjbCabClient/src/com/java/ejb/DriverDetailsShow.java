package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DriverDetailsShow {

	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		   UserBeanRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (UserBeanRemote)
		    		new InitialContext().lookup("UserBean/remote");

		    List<DriverDetails> driverDetailsList = service.showDriverDetailsBean();
		    for (DriverDetails driverDetails : driverDetailsList) {
				System.out.println(driverDetails);
			}

	}
}
