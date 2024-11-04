package com.java.testInheritance;

import java.util.Scanner;

public class Sum_check {
	public static void main(String[] args) {
		int num1, num2, sum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		num2= scanner.nextInt();
		sum= num1+num2;
		if(sum>30) {
			System.out.println(sum);
		}
		else {
			Sum_check.main(args);
		}
	}
}
