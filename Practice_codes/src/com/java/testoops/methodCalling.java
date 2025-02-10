package com.java.testoops;

public class methodCalling {
	public static void main(String[] args) {
		// Create an instance of HelperClass
		HelperClass helper = new HelperClass();

		// Call the method from HelperClass
		String message = helper.greet("World");

		// Print the returned message
		System.out.println(message);
	}
}

class HelperClass {
	// Method declaration
	public String greet(String name) {
		return "Hello, " + name + "!";
	}
}
