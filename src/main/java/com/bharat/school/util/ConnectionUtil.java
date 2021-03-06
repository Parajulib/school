package com.bharat.school.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionUtil {

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession()
	{
		Session session = getSessionFactory().getCurrentSession();
		if(session == null)
			session = getSessionFactory().openSession();
		
		return session;
	}
	
	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
