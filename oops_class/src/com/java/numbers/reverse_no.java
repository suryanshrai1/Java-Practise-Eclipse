package com.java.numbers;

import java.util.Scanner;

public class reverse_no {
	public static void main(String[] args) {
		int num;
		int sum=0;
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		num= scanner.nextInt();
		while(num>0) {
			a = num %10;
			sum= sum*10 +a;
			num = num/10;
		}
		System.out.println("The reverse of the number is:"+ sum);
	}

}
