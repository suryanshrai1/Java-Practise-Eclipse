package com.java.numbers;

import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
			int arr[]=new int[5];
			int temp;
			System.out.println("Enter array");
			Scanner scanner=new Scanner(System.in);
			
			for(int i=0;i<5;i++)
			{
				arr[i]=scanner.nextInt();
			}
			System.out.println("Enter the number to search:");
			int no = scanner.nextInt();
			int c=0;
				for(int i=0; i<5; i++) {
					if(no == arr[i]) {
						c=1;
					}
				}
				if(c==1) {
						System.out.println("Number found.");
				}
					
				else {
					System.out.println("Number not found.");
			}
				scanner.close();
			
		
	}
}


