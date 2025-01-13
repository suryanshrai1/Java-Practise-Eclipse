package com.java.ADSTest;

public class ReverseString {
	public static void main(String[] args) {
		String str [ ] = {"HelloWorld"};
		int start =0;
		int end = str.length -1;
		String temp;
		while(start < end) {
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		System.out.println(str);
	}
}
