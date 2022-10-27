package com.infinite.hibemployweb;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {

	public static SessionFactory getSession() {
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}
}