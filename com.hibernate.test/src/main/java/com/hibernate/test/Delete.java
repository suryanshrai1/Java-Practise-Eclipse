package com.hibernate.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.getTransaction().begin();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enetr id to be delete");
		//String newName=scanner.next();
		//System.out.println("enter id to update");
		Employee employee=session.get(Employee.class, scanner.nextInt());
		session.delete(employee);
		//employee.setName(newName);
		//session.save(employee);
		session.getTransaction().commit();

	}

}
