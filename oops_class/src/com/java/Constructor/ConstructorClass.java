package com.java.Constructor;

public class ConstructorClass {
	String firstname;
	String lastname;
	
	// Constructor- which is used to initialize the object's attributes 
	//- special method in a class that is automatically called when an object of the class is created.
	public ConstructorClass(String firstname, String lastname) {
		
		this.firstname= firstname;
		this.lastname = lastname;
	}
		// Method to return full name
		public String getfullname( ) {
			return firstname + " " + lastname;
		}
		
		public static void main(String[] args) {
			
			// instance of Person using the constructor
			ConstructorClass person = new ConstructorClass (" Suryansh", "Rai");
			
			// method to get the full name
			String fullname = person.getfullname();
			System.out.println("My name is :" + fullname);
			
		}
	}

