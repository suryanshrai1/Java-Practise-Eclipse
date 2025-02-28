package com.java.recursion;
import java.util.*;
public class guessNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr [] = {"One","Two", "Three", "Four", "FIve", "SIx", "Seven", "Eight", "Nine", "Ten"};
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		guessN(n, arr);	
	}
	
	public  static void  guessN(int n, String[]arr) {
		if(n==0) {
			return ;
		}
		int digit= n%10;
		n = n/10;
		
		System.out.println(arr[digit-1]);
		
		guessN(n, arr);
	}
}
