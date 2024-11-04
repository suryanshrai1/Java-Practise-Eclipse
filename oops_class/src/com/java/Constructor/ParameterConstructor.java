package com.java.Constructor;

public class ParameterConstructor {
    private String firstname;
    private String lastname;

    // Parameterized Constructor
    public ParameterConstructor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Parameterized Method
    public String getFullName(String title) {
        return title + " " + firstname + " " + lastname;
    }
}
