package com.hibernate.client;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.employee;
import com.hibernate.util.HibernateUtil;

public class createTable {
	
	public static void main(String args[]) {
		
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		try {
			factory = HibernateUtil.obtainSessionFactory();
			session = factory.getCurrentSession();
			txn = session.beginTransaction();
			
			//save new record
			
			employee emp = new employee();
			
			System.out.println("Table created successfully...");
			session.save(emp);
			System.out.println("Table Saved successfully...");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}