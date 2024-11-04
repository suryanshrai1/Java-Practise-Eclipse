package com.java.overriding;

public class CallMain {

    public static void main(String[] args) {
        Parent obj = new Child();  
        int result = obj.multiply();  
        System.out.println("Result from ClassB: " + result);  
    }
}
