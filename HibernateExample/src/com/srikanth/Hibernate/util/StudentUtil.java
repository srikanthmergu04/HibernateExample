




package com.srikanth.Hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentUtil {
	
	private static SessionFactory factory = null;
	private static Session session = null;
	private static ThreadLocal<Session> sessions = new ThreadLocal<Session>();
	
	static {
		factory = new Configuration().configure("conf/hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static Session getSession() {
		
		if(sessions.get()!=null)
		{
			return session;
		}else {
			session = factory.openSession();
			sessions.set(session);
			return session;
			
			
		}
	}
	
	
	public static void closeSessionFactory() {
		factory.close();
		
	}
	
	public static void closeSession() {
		Session session = sessions.get();
		if(session!=null) {
			sessions.remove();
			session.close();
		}
	}

}
