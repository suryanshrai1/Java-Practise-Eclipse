package com.java.testOverloading;

public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample calculator = new MethodOverloadingExample();
        
        System.out.println("Sum of 5 and 10 (int): " + calculator.add(5, 10));
        System.out.println("Sum of 5, 10, and 15 (int): " + calculator.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5 (double): " + calculator.add(5.5, 10.5));
    }
}
