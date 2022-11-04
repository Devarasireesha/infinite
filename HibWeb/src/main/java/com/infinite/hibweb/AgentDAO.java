package com.infinite.hibweb;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class AgentDAO {

SessionFactory sessionFactory;
Session session;
public Agent searchAgent(int agentId){
	sessionFactory = SessionHelper.getConnection();
	session = sessionFactory.openSession();
	Query query = session.createQuery("from Agent where agentId="+agentId);
	List<Agent> agentlist = query.list();
	if(agentlist.size()==1){
		System.out.println(agentlist.get(0));
		
	}else{
		System.out.println("***Record Found***");
		
	}
	return null;
	
	
	
}

public List<Agent> showAgent() {
sessionFactory = SessionHelper.getConnection();
session = sessionFactory.openSession();
Query query = session.createQuery("from Agent");
List<Agent> agentList = query.list();
return agentList;
}
}


