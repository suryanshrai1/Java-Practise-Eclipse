package com.java.ADSTest;

import java.util.Scanner;

public class SumOfNaturalNos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number: ");
		int n = sc.nextInt();
		int sum = n*(n+1)/2;
		System.out.println("The sum of natural numbers till "+ n + " is "+ sum);
		
	}
}
