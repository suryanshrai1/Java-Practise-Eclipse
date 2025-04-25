package com.hibernate.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class displayAll {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        // Fetch and display all employees
        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName());
        }

        // Clean up
        session.close();
        factory.close();
    }
}