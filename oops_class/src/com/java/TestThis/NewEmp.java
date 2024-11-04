package com.java.TestThis;

public class NewEmp {
	private int id;
	private String name;
	private float salary;
	
	public NewEmp() {
		// default constructor-- good practice to use
	}
	
	
	
	public NewEmp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {               // TO get all data as a string(we can also print without using this and use getter instead)
		return "Employye [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
