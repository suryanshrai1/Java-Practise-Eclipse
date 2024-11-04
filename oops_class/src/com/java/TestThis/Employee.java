package com.java.TestThis;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {               // TO get all data as a string(we can also print without using this and use getter instead)
		return "Employye [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
