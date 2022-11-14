package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CabBean
 */
@Stateless
@Remote(UserBeanRemote.class)
public class UserBean implements UserBeanRemote{
static UserDAO udao;
	
	static {
		udao = new UserDAO();
	}
    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

	

	

	
	@Override
	public UserDetails searchUserDetailsBean(int userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return udao.searchUserDetails(userId);
	}





	@Override
	public List<DriverDetails> showDriverDetailsBean() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return udao.showDriverDetails();
	}





	

}
