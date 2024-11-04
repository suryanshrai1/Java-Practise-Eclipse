package com.java.sorting;

import java.util.Scanner;

public class SortingofData {
	public static void main(String[] args) {
		int arr[]=new int[6];
		int temp;
		System.out.println("Enter array");
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=scanner.nextInt();
		}
	for(int x=0; x<5; x++){
		for(int i=0;i<4;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		}
	}
			
		for(int i=0;i<5;i++)
		{
		System.out.println(arr[i]);
		}
	}
}
	

