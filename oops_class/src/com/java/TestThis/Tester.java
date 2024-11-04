package com.java.TestThis;

public class Tester {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("User");
		emp1.setSalary(59788);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("New User");
		emp2.setSalary(68788);
		System.out.println(emp1+ " "+ emp2);

		// to print one by one using getter and not string
//		System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
//		System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary());
	}

}
