package com.java.numbers;
import java.util.Scanner;

public class MathOperations {
	public static void main(String[] args) {
		int num1; int num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		num2 = scanner.nextInt();
		
		System.out.println("Sum is:" + (num1+num2));
        System.out.println("Difference is:" + (num1-num2));
        System.out.println("Product is:" + (num1*num2));
        System.out.println("Quotient is:"+(num1/num2));
        System.out.println("Remainder is:"+(num1%num2));
		
	}
}
