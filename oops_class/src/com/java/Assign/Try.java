package com.java.Assign;

public class Try {
    public static void main(String[] args) {
        
        Child obj = new Child();
        
        int add = obj.Add();
        System.out.println("Addition (from Parent class): " + add);
        
        int sub = obj.Subtraction();
        System.out.println("Subtraction (from Child class): " + sub);
    }
}
