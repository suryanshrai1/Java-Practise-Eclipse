package com.java.overriding;

public class Child extends Parent {

    public int multiply() {
        int num1, num2, res;
        num1 = 7;
        num2 = 30;
        res = num1 * num2;
        return res;  
    }

    public String toString() {
        return "ClassB [obj]";
    }
}
