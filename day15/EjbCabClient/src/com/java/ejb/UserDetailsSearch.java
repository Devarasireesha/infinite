package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class UserDetailsSearch {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		int userId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserId ");
		userId = sc.nextInt();
		   UserBeanRemote service = null;
		    service = (UserBeanRemote)
		    		new InitialContext().lookup("UserBean/remote");
		UserDetails userDetails = service.searchUserDetailsBean(userId);
		if (userDetails!=null) {
			System.out.println(userDetails);
		}

	}
}
