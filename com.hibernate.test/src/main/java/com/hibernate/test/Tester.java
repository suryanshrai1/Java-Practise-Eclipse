package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	 public static void main(String[] args) {
		 Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			System.out.println("Configuration done !!");
			//SessionFactory sessionFactory=configuration.buildSessionFactory();
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			Employee employee=new Employee();
			employee.setId(3);
			employee.setName("Ashwani");
			//session.save(employee);
			session.save(employee);
			transaction.commit();
			session.close();
			System.out.println("Employee added !");
	}

}
