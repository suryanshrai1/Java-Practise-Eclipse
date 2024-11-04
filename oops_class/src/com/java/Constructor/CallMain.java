package com.java.Constructor;

public class CallMain {
    public static void main(String[] args) {
        //  instance of ParameterConstructor
        ParameterConstructor person = new ParameterConstructor("Suryansh", "Rai");
        
        // Call method 
        String fullname = person.getFullName("");
        System.out.println("My name is: " + fullname);
    }
}
