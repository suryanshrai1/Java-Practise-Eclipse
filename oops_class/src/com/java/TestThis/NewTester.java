package com.java.TestThis;

public class NewTester {
public static void main(String[] args) {
		
		NewEmp emp1 = new NewEmp(1, "User", 5889);
		NewEmp emp2 = new NewEmp(2, "Second User", 7889);
		
		
		
		System.out.println(emp1+ " "+ emp2);

		// to print one by one using getter and not string
//		System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
//		System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary());
	}

}
