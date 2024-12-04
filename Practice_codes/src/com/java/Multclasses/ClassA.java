package com.java.Multclasses;

import java.util.Scanner;

public class ClassA {
	public int Sum( ) {
		int num1, num2, sum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		num2 = scanner.nextInt();
		sum = num1+num2;
		return sum;
				
    }
}