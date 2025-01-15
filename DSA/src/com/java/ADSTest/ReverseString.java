package com.java.ADSTest;

public class ReverseString {
	public static void main(String[] args) {
		char str [ ] = "HelloWorld".toCharArray();
		int start =0;
		int end = str.length -1;
		char temp;
		while(start < end) {
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		for(int i= 0; i< str.length; i++) {
			System.out.print(str[i]);
			
		}
	}
}
