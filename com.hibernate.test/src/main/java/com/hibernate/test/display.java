package com.hibernate.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class display {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enetr id");

		Employee employee=session.get(Employee.class,scanner.nextInt());
		System.out.println(employee.getName());
		factory.close();
	}
	
}
