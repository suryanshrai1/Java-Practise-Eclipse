package com.java.numbers;

import java.util.Scanner;

public class CallArray {
	public static void main(String[] args) {
		int arr[] = new int[6];
		int sum = 0;
		System.out.println("Enter array:");
		Scanner scanner = new Scanner(System.in);
		for(int i =0 ; i<5; i++) {
			arr[i] = scanner.nextInt();
			
		}
		for(int i=0; i<6; i++) {
			sum = sum+arr[i]; // This is operation
			
		}
		System.out.println(sum);
	}
	
}
