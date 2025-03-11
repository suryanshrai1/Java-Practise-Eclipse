package com.hibernate.test;

import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("1");

	}

}
