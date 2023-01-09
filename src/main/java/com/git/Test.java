package com.git;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// step-1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// step_2
		SessionFactory sf = configuration.buildSessionFactory();

		// step3
		Session session = sf.openSession();
		
		//step-4
		Transaction transaction = session.beginTransaction();
	
		//step-5
		
	Student std = (Student) session.get(Student.class, 1);
		
	std.setName("Rohan");
	std.setCity("Kohapur");
	
	System.out.println("edit  done");
	
	session.update(std);
		
		transaction.commit();
		
		System.out.println("Record is updated >>>>");
		
	}
}
