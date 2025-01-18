package com.java.ADSTest;

public class VowelCount {
	public static void main(String[] args) {
		String str= "suryanshrai";
		char[] arr = str.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] =='a' || arr[i]=='e' || arr[i] =='i' || arr[i]=='o' || arr[i] =='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
